package com.company;

import java.util.Scanner;

public class SleepingTom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalNonWorkingDaysPerYear = Integer.parseInt(scanner.nextLine());

        int minutesNormPerYear = 30000;

        int totalWorkingDaysPerYear = 365 - totalNonWorkingDaysPerYear;

        int totalPlayTimePerYear = (totalWorkingDaysPerYear * 63) + (totalNonWorkingDaysPerYear * 127);

        int playTimeDifference = Math.abs(totalPlayTimePerYear - minutesNormPerYear);

        int totalHours = Math.abs(playTimeDifference / 60);

        int totalMinutes = Math.abs(playTimeDifference % 60);

        if (totalPlayTimePerYear > minutesNormPerYear) {

            System.out.println("Tom will run away!");
            System.out.printf("%d hours and %02d minutes more for play ", totalHours, totalMinutes);


        } else if (totalPlayTimePerYear <= minutesNormPerYear) {

            System.out.println("Tom sleeps well!");
            System.out.printf("%d hours and %02d minutes less for play ", totalHours, totalMinutes);


        }

    }
}
