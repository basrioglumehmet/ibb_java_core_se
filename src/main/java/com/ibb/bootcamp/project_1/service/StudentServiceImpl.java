package com.ibb.bootcamp.project_1.service;

import com.ibb.bootcamp.project_1.dto.StudentDto;
import com.ibb.bootcamp.project_1.enums.Status;
import com.ibb.bootcamp.project_1.enums.StudentGrade;
import com.ibb.bootcamp.project_1.pojo.Student;
import com.ibb.bootcamp.project_1.pojo.StudentResultTerm;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService{
    private static final List<Student> students = new ArrayList<>();
    private static final String FILE_NAME = "students.csv";
    private static boolean isHeaderAdded = false;

    {
        //JVM veya program başladığında txt dosyasından öğrenci verilerini aktar.
        loadStudentsFromFile();
    }

    @Override
    public void create(StudentDto studentDto) {
        double score = studentDto.getMidTerm() * 0.30 + studentDto.getFinalTerm() * 0.70;
        StudentResultTerm resultTerm = StudentResultTerm.builder().status(Status.fromScore(score)).grade(StudentGrade.fromScore(score)).build();
        Student student = Student.builder()
                .id(students.size() + 1)
                .createdAt(LocalDateTime.now())
                .midTerm(studentDto.getMidTerm())
                .finalTerm(studentDto.getFinalTerm())
                .studentResultTerm(resultTerm)
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
    private static void loadStudentsFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            String line = bufferedReader.readLine(); // İlk satırı oku
            int index = 0;

            while (line != null) {
                if (index == 0) {
                    line = bufferedReader.readLine(); // İlk satırı atla ve bir sonraki satırı oku
                    index++;
                    continue; // Döngünün başına dön
                }

                // CSV formatında: Mehmet Basrioğlu, PASS, 80.0, 90.0, BB, 2025-01-01, 2025-03-01T15:45:04.992591200
                String[] data = line.split(",");
                String fullName = data[0].trim();
                String status = data[1].trim();
                String midTerm = data[2].trim();
                String finalTerm = data[3].trim();
                String score = data[4];
                String grade = data[5].trim();
                LocalDate birthDate = LocalDate.parse(data[6].trim());
                LocalDateTime createdAt = LocalDateTime.parse(data[7].trim());

                System.out.println(line);

                line = bufferedReader.readLine(); // Bir sonraki satırı oku
            }

            bufferedReader.close(); // Belleği şişirmemek için kapat
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void insertHeaders(){
       if(!isHeaderAdded){
           try(FileOutputStream fos = new FileOutputStream(FILE_NAME,true)){
               PrintStream printStream = new PrintStream(fos);
               String headers = String.format("%s, %s, %s, %s, %s, %s, %s",
                       "Adı ve Soyadı",
                       "Geçti Kaldı",
                       "Vize Notu",
                       "Final Notu",
                       "Başarı Puanı",
                       "Harf",
                       "Doğum Tarihi",
                       "Oluşturuldu");
               printStream.println(headers);
               isHeaderAdded = true;
               System.out.println("Başlıklar Kayıt Edildi");
           }
           catch (IOException ex){
               ex.printStackTrace();
           }
       }
    }

    private static boolean insertStudentIntoFile(Student student){
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME, true);
             PrintStream printStream = new PrintStream(fos)) {


            String csvLine = String.format("%s, %s, %s, %s, %s, %s, %s, %s",
                    student.getFullName(),
                    student.getStudentResultTerm().getStatus(),
                    student.getMidTerm(),
                    student.getFinalTerm(),
                    student.getMidTerm() * 0.30 + student.getFinalTerm() * 0.70,
                    student.getStudentResultTerm().getGrade().getText(),
                    student.getBirthDate(),
                    student.getCreatedAt());

            printStream.println(csvLine);
            System.out.println("Öğrenci Kayıt Edildi");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
