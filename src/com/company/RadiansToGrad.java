package com.company;

import java.util.Scanner;

public class RadiansToGrad {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double radians = Double.parseDouble(scr.nextLine());
        double grad = radians * 180 / Math.PI;
        System.out.printf("The number in grad is:%.2f",grad);
    }
}
