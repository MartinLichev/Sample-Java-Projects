package com.company;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scr.nextLine());
        int sum = 0;
        for(int a = 1; a <= numbersCount; a++){
            int number = Integer.parseInt(scr.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
