package com.company;

import java.util.Scanner;

public class StudyHall {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double hallWidth = Double.parseDouble(scr.nextLine());
        double hallHeight = Double.parseDouble(scr.nextLine());
        double perimeterHall = 2 * (hallHeight + hallWidth);
        double perimeterOneWorkPlace = 2 * (70 + 120 );
        double hallcoridor = 100;
        double perimeterPodium = 2 * (160 + 120);


    }
}
