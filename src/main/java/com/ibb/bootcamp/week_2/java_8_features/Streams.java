package com.ibb.bootcamp.week_2.java_8_features;

import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> cars = List.of("BMW","Mercedes-Benz","Kia","Hyundai","Tesla");
        List<String> filteredCars =  cars.stream().filter(e -> e.contains("d")).toList();
        filteredCars.stream().forEach(System.out::println);
        long size = filteredCars.size();
        System.out.println(size);
    }
}
