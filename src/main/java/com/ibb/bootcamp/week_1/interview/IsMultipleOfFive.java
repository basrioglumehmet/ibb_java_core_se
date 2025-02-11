package com.ibb.bootcamp.week_1.interview;

import java.util.Scanner;

public class IsMultipleOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number:");
        int number = scanner.nextInt();

        if(number % 5 == 0){
            System.out.println("Multiple of 5");
        }
        else{
            System.out.println("Not a multiple of 5.");
        }
    }
}
