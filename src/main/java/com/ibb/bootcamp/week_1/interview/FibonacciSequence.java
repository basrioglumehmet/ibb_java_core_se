package com.ibb.bootcamp.week_1.interview;

public class FibonacciSequence {
    public static void main(String[] args) {
        // The Fibonacci sequence is the series of numbers where each number is the sum of the two preceding numbers.
        // For example, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610
        // Big O Notation = O(n) FASTER
        int number1 = 0;
        int number2 = 1;
        for (int i = 0; i < 90; i++) {
            //Print the first replaced number (it's used to print the sequence).
            System.out.print(String.format("%d,",number1));
            int result = number2 + number1;
            //Swapping Operation
            //Example: 0(number1),1(number2) replaced to 1(number2) + 1(sum)
            number1 = number2;
            number2 = result;
        }
        System.out.println("");
    }
}
