package com.ibb.bootcamp.part_one.interview;

import java.util.Scanner;

public class FindDigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number:");
        int number = scanner.nextInt();
        int digitCount = String.valueOf(number).length();
        System.out.println(digitCount);
    }
}
