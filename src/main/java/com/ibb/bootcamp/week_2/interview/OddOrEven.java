package com.ibb.bootcamp.week_2.interview;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // Get input
        //Low bit manipulation
        if((number & 1) == 0){
            System.out.println("Çift");
        }
        else{
            System.out.println("Tek");
        }
    }
}
