package com.ibb.bootcamp.week_1.interview;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //Check the user input is a valid prime number.
        /*
            a number that can only be divided by itself and 1 without remainders
            WARNING! 1 only has one factor, so 1 isn't a prime number.
        */

        System.out.println("Write a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0) {
                    isPrime = false;
                    break; // As soon as a divisor is found, we can break out of the loop.
                }
            }
        }
        System.out.println(String.format("Is Prime Number: %s (%d)",isPrime == true ? "Yes":"No",num));

    }
}
