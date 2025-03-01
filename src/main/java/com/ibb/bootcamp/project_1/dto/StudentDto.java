package com.ibb.bootcamp.project_1.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@EqualsAndHashCode
public class StudentDto implements Serializable {
    //Serileştirme işlemi
    @Serial
    private static final long serialVersionUID = 5563646556456565467L;

    private String name;
    private String surname;
    private LocalDate birthDate = LocalDate.now();
    private double midTerm; //Vize Notu
    private double finalTerm; //Final Notu
}
