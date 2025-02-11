package com.ibb.bootcamp.week_1.interview;

import java.util.Scanner;

public class DigitMultiplier {
    public static void main(String[] args) {
        //Todo: User input-based multiplier operation digit by digit.
        //O(log(n)) is the best way but if we do o(n) may it'll worst way because the time will increase.
        //Kullanıcının girdiği sayının rakamların carpım sonucu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number: ");
        int number = scanner.nextInt(), currentNumber, multiplierResult = 1;

        while (number != 0){
            currentNumber = number % 10;
            multiplierResult *= currentNumber;
            System.out.println(currentNumber);
            number /= 10;
        }
        System.out.println(String.format("Multiplier result: %d",multiplierResult));
    }
}
