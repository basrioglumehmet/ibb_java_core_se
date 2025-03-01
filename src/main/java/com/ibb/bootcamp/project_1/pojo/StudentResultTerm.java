package com.ibb.bootcamp.project_1.pojo;

import com.ibb.bootcamp.project_1.enums.Status;
import com.ibb.bootcamp.project_1.enums.StudentGrade;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
public class StudentResultTerm implements Serializable {
    @Serial
    private static final long serialVersionUID = 2;

    private Status status;
    private StudentGrade grade;
}
