package com.ibb.bootcamp.week_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateFormatExample {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MMMM hh:mm:ss");
        String now = LocalDateTime.now().format(formatter);
        System.out.println(now);
    }
}
