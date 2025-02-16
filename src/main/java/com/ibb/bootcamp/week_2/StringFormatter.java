package com.ibb.bootcamp.week_2;

import java.util.Formatter;

public class StringFormatter {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("Merhabalar Adınız: %s, T.C: %d, Fiyat:%f", "Mehmet",1234567891, 44.23);
        System.out.println(formatter);
        formatter.close(); //Bellek sızıntısını önlemek için close tanımlanmalıdır

        //Best Practice
        final String GENERAL_LOG_PATTERN = "Class: %s Hata Mesajı:%s";
        System.out.println(String.format(GENERAL_LOG_PATTERN,StringFormatter.class.getName(),"İBB Bootcamp"));
    }
}
