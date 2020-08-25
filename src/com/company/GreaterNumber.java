package com.company;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Please input two numbers");
        double a = Double.parseDouble(scr.nextLine());
        double b = Double.parseDouble(scr.nextLine());
        if(a > b ){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
