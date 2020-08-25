package com.company;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String typeOfYear = scr.nextLine();
        int numberOfHolidays = Integer.parseInt(scr.nextLine());
        int weekends = Integer.parseInt(scr.nextLine());
        int totalWeekends = 48;
        int weekendsSofia = Math.abs(totalWeekends - weekends);
        double numberOfPlaysInSofia = weekendsSofia * (3.0 / 4);
        double numberOfPlaysInHomeTown = weekends;
        double numberOfPlaysDuringHolidays = numberOfHolidays * (2.0 / 3);
        double totalSum = numberOfPlaysInSofia + numberOfPlaysInHomeTown + numberOfPlaysDuringHolidays;
        switch(typeOfYear){
            case "leap":
                totalSum += (totalSum * 15) / 100;
                break;
            case "normal":
                break;
        }
        System.out.println(Math.floor(totalSum));

    }
}
