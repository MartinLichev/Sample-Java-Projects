package com.company;

import java.util.Scanner;

public class ExcellentMarkCheck {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Please input grade:");
        int input = Integer.parseInt(scr.nextLine());
        if(input >= 5){
            System.out.println("Excellent!");
        }

    }
}
