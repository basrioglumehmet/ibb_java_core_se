package com.ibb.bootcamp.project_1.pojo;

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
public class Student implements Serializable{
    //Serileştirme işlemi
    @Serial
    private static final long serialVersionUID = 5563646556456565465L;
    private int id;
    private String fullName;
    private LocalDate birthDate = LocalDate.now();
    private LocalDateTime createdAt = LocalDateTime.now();
    private double grade; //Başarı Puanı
}
