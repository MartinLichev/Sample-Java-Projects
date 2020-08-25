package com.company;

import java.util.Scanner;

public class NumbersFrom1toNInBetween3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int input = Integer.parseInt(scr.nextLine());
        for(int a = 1; a <= input; a++){
            System.out.println(a);
            a += 2;

        }
    }
}
