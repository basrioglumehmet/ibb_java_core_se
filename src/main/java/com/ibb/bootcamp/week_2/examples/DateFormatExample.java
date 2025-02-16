package com.ibb.bootcamp.week_2.examples;

import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Tarih:"
        + now.getDate() + "/"+now.getDay()+":"+now.getHours() + ":"+now.getMinutes() +":"+ now.getSeconds()
        );
    }
}
