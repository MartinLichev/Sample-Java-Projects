package com.company;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int hour = Integer.parseInt(scr.nextLine());
        String day = scr.nextLine();
        if((day.equals("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday"))&& (hour >= 10) && (hour <= 18)){
            System.out.println("Open");
        }else{
            System.out.println("Closed");
        }
    }
}
