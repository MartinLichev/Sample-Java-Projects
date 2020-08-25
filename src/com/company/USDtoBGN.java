package com.company;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double input = Double.parseDouble(scr.nextLine());
        double bgncurrency = input * 1.80;
        System.out.printf("The currency in \"BGN\" is:%.2f",bgncurrency);
    }
}
