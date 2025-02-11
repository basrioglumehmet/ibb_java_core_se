package com.ibb.bootcamp.week_2.interview;

import java.util.Scanner;

public class Return_Continue_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt(), sum = 0;

        for (int i = 0; i < Math.abs(input); i++) {
            if(i > 100) break;
            if(i == 47) continue;
            sum += i;
        }
        System.out.println(sum);
    }
}
