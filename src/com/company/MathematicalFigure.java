package com.company;

import java.util.Scanner;

public class MathematicalFigure {
    public static void main(String[]args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter figure type:");
        String input = scr.nextLine();
        switch (input){
            case "square":
                double a = Double.parseDouble(scr.nextLine());
                System.out.printf("%.3f"+(a * 4));
            case "rectangle":
                double b = Double.parseDouble(scr.nextLine());
                double c = Double.parseDouble(scr.nextLine());
                System.out.printf("%.3f"+(b * c));
            case "circle":
                double d = Double.parseDouble(scr.nextLine());
                System.out.printf("%.3f"+(d*2));
            case "triangle":
                double e = Double.parseDouble(scr.nextLine());
                double f = Double.parseDouble(scr.nextLine());
                System.out.printf("%.3f"+(e * f)/2);
        }
        }
}
