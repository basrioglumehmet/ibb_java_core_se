package com.ibb.bootcamp.project_1.service;

import com.ibb.bootcamp.project_1.dto.StudentDto;
import com.ibb.bootcamp.project_1.pojo.Student;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService{
    private static final List<Student> students = new ArrayList<>();
    private static final String FILE_NAME = "students.csv";

    {
        //JVM veya program başladığında txt dosyasından öğrenci verilerini aktar.
        loadStudentsFromFile();
    }

    @Override
    public void create(StudentDto studentDto) {
        Student student = Student.builder()
                .id(students.size() + 1)
                .createdAt(LocalDateTime.now())
                .grade(studentDto.getGrade())
                .birthDate(studentDto.getBirthDate())
                .fullName(studentDto.getName() + " "+ studentDto.getSurname()).build();
        students.add(student);
        insertStudentIntoFile(student);
    }

    @Override
    public Student read(int studentId) {
        return null;
    }

    @Override
    public Student update(StudentDto studentDto) {
        return null;
    }

    @Override
    public void delete(int studentId) {

    }

    private static void loadStudentsFromFile(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            String line = bufferedReader.readLine();
            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine(); //Bir sonraki satırı okuru
            }
            bufferedReader.close(); //Belleği şişirmemek için reader'ı kapatmalısın.
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static boolean insertStudentIntoFile(Student student){
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME, true);
             PrintStream printStream = new PrintStream(fos)) {

            // CSV formatında: "Mehmet B, 10, 2005-06-15, 2024-02-22"
            String csvLine = String.format("%s, %s, %s, %s",
                    student.getFullName(),
                    student.getGrade(),
                    student.getBirthDate(),
                    student.getCreatedAt());

            printStream.println(csvLine);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
