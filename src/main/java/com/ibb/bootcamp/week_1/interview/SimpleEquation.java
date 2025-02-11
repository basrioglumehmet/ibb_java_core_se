package com.ibb.bootcamp.week_1.interview;

import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) {
        //Q: ax + b = 0 (find the x number)
        // First we need leave alone the X number
        int x, a,b;
        //Read cli input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the a number value:");
        a = scanner.nextInt();
        System.out.println("Please enter the b number value:");
        b = scanner.nextInt();
        scanner.close(); //Avoid the memory leak
        /*
         Scenario: ax = -b (+b moved to the right side as negative)
         Scenario: x = -b / a (a number is moved to the right side as a divide because of the multiplier)
        */
        x = -b / a;
        System.out.println(String.format("Result: %04d",x));

    }
}
