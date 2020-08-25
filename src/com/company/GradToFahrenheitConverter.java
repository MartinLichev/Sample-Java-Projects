package com.company;

import java.util.Scanner;

public class GradToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double grad = Double.parseDouble(scr.nextLine());
        double fahrenheit = (grad * 1.8) + 32;
        System.out.println(fahrenheit);
    }
}
