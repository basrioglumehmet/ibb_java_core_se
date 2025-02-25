package com.ibb.bootcamp.project_1.service;
import com.ibb.bootcamp.project_1.dto.StudentDto;
import com.ibb.bootcamp.project_1.pojo.Student;

public interface StudentService {
    void create(StudentDto studentDto);
    Student read(int studentId);
    Student update(StudentDto studentDto);
    void delete(int studentId);

    static void loadStudentsFromFile() {
        //Override edilemez.
        //Default yapılar sadece override edilebilir.
        //Bunun burada kullanımı solid prensibine aykırıdır dolayısıyla burayı boş bırakacağım.
    }
}
