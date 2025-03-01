package com.ibb.bootcamp.project_1.controller;

import com.ibb.bootcamp.project_1.dto.StudentDto;
import com.ibb.bootcamp.project_1.service.StudentService;
import com.ibb.bootcamp.project_1.service.StudentServiceImpl;

public class StudentController {
    private final StudentService studentService = new StudentServiceImpl(); //Singleton Instance

    public void create(StudentDto dto){
        this.studentService.create(dto);
    }
    public void insertHeader(){this.studentService.insertHeaders();}
}
