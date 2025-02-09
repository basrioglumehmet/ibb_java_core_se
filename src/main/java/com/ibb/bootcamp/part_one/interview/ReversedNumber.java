package com.ibb.bootcamp.part_one.interview;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        //Q: Print the number as reversed
        /*
        Logic: First get ten digit value
        Logic: Than get other digit values
        Example: 123 to 321
        */

        System.out.println("Write a number:");
        Scanner scanner = new Scanner(System.in);
        int reversedNumber= 0, inputNumber = scanner.nextInt();
        while(inputNumber != 0){
            reversedNumber = reversedNumber * 10 + inputNumber % 10; //First Digit
            inputNumber /= 10; //Divide n times
        }

        System.out.println(reversedNumber);

    }
}
