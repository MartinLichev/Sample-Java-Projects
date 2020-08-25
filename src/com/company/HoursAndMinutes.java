package com.company;

import java.util.Scanner;

public class HoursAndMinutes {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int hour = Integer.parseInt(scr.nextLine());
        int minutes = Integer.parseInt(scr.nextLine());
        int total = (hour * 60) + (minutes + 15);
        hour = total / 60;
        minutes = total % 60;

        if(hour > 24){
            hour = 0;
        }

        System.out.printf("%d:%02d", hour,minutes);


    }
}
