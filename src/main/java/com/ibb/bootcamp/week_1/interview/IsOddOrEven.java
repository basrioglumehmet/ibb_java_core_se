package com.ibb.bootcamp.week_1.interview;

import java.util.Scanner;

public class IsOddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Çift");
        } else {
            System.out.println("Tek");
        }
    }
}
