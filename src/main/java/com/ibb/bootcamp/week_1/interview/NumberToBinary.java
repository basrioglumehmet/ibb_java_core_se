package com.ibb.bootcamp.week_1.interview;

import java.util.Scanner;

public class NumberToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number:");
        int inputNumber= scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder("");
        while(inputNumber != 0){
            int remainder = inputNumber % 2;
            inputNumber /= 2;
            System.out.println(String.format("%d / 2 = %d, remainder = %d", inputNumber, inputNumber / 2, inputNumber % 2));

            stringBuilder.append(Integer.toString(remainder));
        }
        // The result always starts from the last remainder to the first remainder.
        System.out.println(String.format("Binary Result:%s", stringBuilder.reverse()));
    }
}
