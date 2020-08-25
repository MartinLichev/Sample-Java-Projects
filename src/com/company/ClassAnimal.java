package com.company;

import java.util.Scanner;

public class ClassAnimal {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();

        switch(input){
            case "dog":
            case "bear":
                System.out.println("Mamal");
            case "snake":
            case "tortoise":
            case "crocodile":
                System.out.println("Reptile");
            default:
                System.out.println("Unknown");
        }
    }
}
