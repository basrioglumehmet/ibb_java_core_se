package com.ibb.bootcamp.part_one.interview;

import java.util.Scanner;

public class CelsiusToFahrenheit {
//    Celsius to fahrenheit converter
//     f = (c *  9 / 5 ) + 32
    public static void main(String[] args) {
        System.out.println("Celsius Value:");
        Scanner firstIo = new Scanner(System.in);
        int celsius = firstIo.nextInt();
        int f = (celsius * 9/5) + 32;
        System.out.println("Result:"+f);
        firstIo.close();
    }
}
