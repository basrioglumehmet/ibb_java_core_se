package com.ibb.bootcamp.part_one.interview;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
        Steps:
        Math.pow(CurrentNumber,3)
        Sum
         */

        System.out.println("Write a number:");
        Scanner scanner = new Scanner(System.in);
        int result = 0, inputNumber = scanner.nextInt(), tmp = inputNumber;
        int numDigits = String.valueOf(inputNumber).length(); //Getting the digit count of the number.
        //Divide numbers operation
        //Get Pow of CurrentNumber
        while(inputNumber != 0){
            int oneDigits = inputNumber % 10; //one digits
            result += Math.pow(oneDigits,numDigits);
            inputNumber /= 10; //getting the ten digits
        }
        if(result == tmp){
            System.out.println(String.format("I'm a armstrong number"));
        }else{
            System.out.println("I'm not a armstrong number");
        }


    }
}
