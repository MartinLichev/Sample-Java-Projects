package com.company;

import java.util.Scanner;

public class TimePlusMinutes {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int hours = Integer.parseInt(scr.nextLine());
        int minutes = Integer.parseInt(scr.nextLine());
        int totalminutes = hours * 60 + minutes + 15;

        hours = totalminutes / 60;
        minutes = totalminutes % 60;
    }
}
