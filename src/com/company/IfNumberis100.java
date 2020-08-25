package com.company;

import java.util.Scanner;

public class IfNumberis100 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = Integer.parseInt(scr.nextLine());
        if (a < 100) {
            System.out.printf("%d is less than 100", a);
        } else if ((a >= 100) && (a <= 200)) {
            System.out.printf("%d is between 100 and 200", a);
        } else if (a > 200) {
            System.out.printf("%d is greater than 200", a);
        }
    }
}


