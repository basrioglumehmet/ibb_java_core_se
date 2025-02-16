package com.ibb.bootcamp.week_2;

import java.util.Arrays;
import java.util.Random;

public class ArrayExamples {
    public static int getRandomNumber(){
        return new Random().nextInt();
    }
    public static void main(String[] args) {
        String [] employees = new String[4];
        employees[0] = "Sibel";
        employees[1] = "Özgün";
        employees[2] = "Mehmet";
        employees[3] = "Fatma";
        String [] employers = {"Sibel","Özgün","Mehmet","Fatma"};

        //Iterative Foor
        for (int i = 0; i < employees.length ; i++) {
            System.out.printf("%s,",employees[i]);
        }
        System.out.println();
        Arrays.sort(employers);
        //Foreach
        for(String employee: employers){
            System.out.printf("%s,",employee);
        }
        System.out.println();
        int[] numbers = new int[6];
        numbers[0] = 1;
        Arrays.fill(numbers, getRandomNumber()); //Dikkat fill tüm nesneleri ezer pre defined veri kaybına sebep olmaktadır.
        Arrays.setAll(numbers, data -> getRandomNumber());
        //Foreach
        for(int number: numbers){
            System.out.printf("%d,",number);
        }
    }
}
