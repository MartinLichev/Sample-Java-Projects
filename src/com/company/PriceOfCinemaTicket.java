package com.company;

import java.util.Scanner;

public class PriceOfCinemaTicket {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String dayOfWeek = scr.nextLine();
        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println("12");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println("14");
            case "Saturday":
            case "Sunday":
                System.out.println("16");
        }
    }
}
