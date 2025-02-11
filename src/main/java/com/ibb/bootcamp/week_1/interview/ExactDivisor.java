package com.ibb.bootcamp.week_1.interview;

import java.util.Scanner;

public class ExactDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number:");
        int num = scanner.nextInt();
        System.out.println("The exact divisors are:");
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                System.out.print(String.format("%d,",i));
            }
        }
    }
}
