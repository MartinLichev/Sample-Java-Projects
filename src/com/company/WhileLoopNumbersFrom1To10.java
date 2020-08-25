package com.company;

import java.util.Scanner;

public class WhileLoopNumbersFrom1To10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int a = 1;

        while(a <= 10){
            System.out.println(a);
            a++;
        }
    }
}
