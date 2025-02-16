package com.ibb.bootcamp.week_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Locale locale = new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss",locale);
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
