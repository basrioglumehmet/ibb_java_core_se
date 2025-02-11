package com.ibb.bootcamp.week_1.interview;

import java.util.Scanner;

// Big O Notation o(log(n))
public class FindBiggestNumberDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number); // Get Absolute value of number

        int maxDigit = 0;
        int digitLocation = -1;
        int position = 0;

        while (number > 0) {
            int currentDigit = number % 10; // Get latest digit
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
                digitLocation = position; // Update position
            }
            number /= 10; // Skip one digit
            position++; // Increase the position.
        }

        System.out.printf("Max digit: %d is at position (%d) in the number.%n", maxDigit, digitLocation + 1);
    }
}
