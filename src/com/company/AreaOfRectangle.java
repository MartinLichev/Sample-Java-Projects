package com.company;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Please input \"two\" numbers:");
        double a = Double.parseDouble(scr.nextLine());
        double b = Double.parseDouble(scr.nextLine());
        double result = (a*b);
        System.out.printf("The area of rectangle is:%.2f",result);
    }
}
