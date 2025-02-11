package com.ibb.bootcamp.week_1.interview;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number:");
        int number = scanner.nextInt(), sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        System.out.println(String.format("Sum result:%d",sum));
    }
}