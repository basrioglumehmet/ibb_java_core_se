package com.ibb.bootcamp.week_2.java_8_features;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aslan", "Mehmet", "Duru");

        // Using forEach on a List
        names.forEach(name -> System.out.println("Selam, " + name));
    }
}
