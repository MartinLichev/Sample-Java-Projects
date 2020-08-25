package com.company;

import java.awt.*;
import java.util.Scanner;

public class InchesToCm {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double input = Double.parseDouble(scr.nextLine());
        double cms = input * 2.54;
        System.out.printf("Your number is cms is: %.2f",cms);


    }
}
