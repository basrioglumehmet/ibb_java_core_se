package com.ibb.bootcamp.project_1;

import com.ibb.bootcamp.project_1.controller.StudentController;
import com.ibb.bootcamp.project_1.dto.StudentDto;

import java.time.LocalDate;

public class Project1Application {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
//controller.insertHeader();
        StudentDto studentDto = StudentDto.builder()
                .midTerm(80)
                .finalTerm(90)
                .birthDate(LocalDate.of(2025,1,1))
                .name("Mehmet")
                .surname("Basrioğlu")
                .build();
        controller.create(studentDto);
    }
}
