package com.company;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class NumbersFromNTo0InReverse {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = Integer.parseInt(scr.nextLine());
        for(int i = a; i > 0; i--){
            System.out.println(i);
        }
    }
}
