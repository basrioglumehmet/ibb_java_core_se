package com.ibb.bootcamp.part_one.interview;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        //Q: Calculate the factorial and get number from user

        System.out.println("Write a number:");
        Scanner scanner  = new Scanner(System.in);
        int result = 1;
        //Formula: n × (n-1) × (n-2) × (n-3) × ..... × 3 × 2 × 1.
        //Logic: 6 * (6-1) * (6 - 2) * (6 - 3) * (6 - 4) * (6 - 5)
        //0! = 1
        //1! = 1
        n = scanner.nextInt();
        scanner.close();
        for (int i = n; i >= 1; i--) {
            result *= i;
            System.out.println(String.format("Calculation Step: result = %d, i = %d", result, i));
        }
     System.out.println(String.format("Result: %d", result));
    }
}
