package com.ibb.bootcamp.week_2.java_8_features;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("Mercedes-Benz");
        stringJoiner.add("Tesla");
        stringJoiner.add("BMW");
        stringJoiner.add("Hyundai");
        System.out.println(stringJoiner.toString());
    }
}
