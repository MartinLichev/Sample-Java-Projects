package com.company;

import java.util.Scanner;

public class NumbersFrom1To1000EndingOn7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        for(int a = 7; a <= 977; a++){
            if(a % 10 == 7){
                System.out.println(a);
            }
        }
    }
}
