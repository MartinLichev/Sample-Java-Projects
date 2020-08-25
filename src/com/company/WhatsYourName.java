package com.company;

import java.util.Scanner;

public class WhatsYourName {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scr.nextLine();
        String result = name;
        System.out.printf("Your name is:%s",result);

    }
}
