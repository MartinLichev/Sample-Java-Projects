package com.company;

import java.util.Scanner;

public class ForLoopNumbersSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numbers = Integer.parseInt(scr.nextLine());
        int sum = 0;
        for(int a = 1; a <= numbers; a++){
            int number = Integer.parseInt(scr.nextLine());
            sum += number;
        }

        System.out.println(sum);
    }
}
