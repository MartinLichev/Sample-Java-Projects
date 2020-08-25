package com.company;

import java.util.Scanner;

public class SumOfNumbersInForLoop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = Integer.parseInt(scr.nextLine());
        int sum = 0;

        for(int a = 0; a < n; a++){
            int input = Integer.parseInt(scr.nextLine());
            sum += input;

        }

        System.out.println(sum);
    }
}
