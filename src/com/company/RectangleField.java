package com.company;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class RectangleField {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double x1 = Double.parseDouble(scr.nextLine());
        double x2 = Double.parseDouble(scr.nextLine());
        double y1 = Double.parseDouble(scr.nextLine());
        double y2 = Double.parseDouble(scr.nextLine());
        double rectanglelenght = y1 - x1;
        double rectanglewidth = y2 - x2;
        double absolutlength = Math.abs(rectanglelenght);
        double absolutwidth = Math.abs(rectanglewidth);
        System.out.printf("Rectangle area is:%.0f" ,(absolutlength * absolutwidth));
        double rectanglecircumference = 2 * (absolutlength + absolutwidth);
        System.out.println();
        System.out.printf("%.0f",rectanglecircumference);


    }
}
