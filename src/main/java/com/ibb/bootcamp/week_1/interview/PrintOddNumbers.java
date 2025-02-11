package com.ibb.bootcamp.week_1.interview;

import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number:");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            if(i % 2 == 1){
                System.out.print(String.format("%d,",i));
            }
        }
    }
}
