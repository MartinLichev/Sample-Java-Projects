package com.company;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Input a number:");
        int a = Integer.parseInt(scr.nextLine());
        if(a % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
