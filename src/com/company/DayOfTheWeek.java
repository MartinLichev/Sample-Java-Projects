package com.company;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int input = Integer.parseInt(scr.nextLine());
        switch(input){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            default:
                System.out.println("Error");
        }
    }
}
