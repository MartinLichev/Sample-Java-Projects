package com.company;

import java.util.Scanner;

public class WorkingDayOrHoliday {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();
        switch (input){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working Day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error!");
        }
    }
}
