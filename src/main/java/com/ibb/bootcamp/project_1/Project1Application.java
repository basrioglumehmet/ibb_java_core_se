package com.ibb.bootcamp.project_1;

import com.ibb.bootcamp.project_1.controller.StudentController;
import com.ibb.bootcamp.project_1.dto.StudentDto;

import java.time.LocalDate;

public class Project1Application {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        StudentDto studentDto = StudentDto.builder()
                .grade(3.81d)
                .birthDate(LocalDate.of(2025,1,1))
                .name("Mehmet")
                .surname("Basrioğlu")
                .build();
        controller.create(studentDto);
    }
}
