package com.company;

import java.util.Scanner;

public class CyclingCompetition {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int juniors = Integer.parseInt(scr.nextLine());
        int seniors = Integer.parseInt(scr.nextLine());
        String race = scr.nextLine().toLowerCase();
        int totalJuniorsAndSeniors = juniors + seniors;
        double taxJuniors = 0;
        double taxSeniors = 0;
        double totaltax = 0;
        double finalsum;
        double totalcharity;

        switch (race) {
            case "trail":
                taxJuniors = juniors * 5.50;
                taxSeniors = seniors * 7;

                break;

            case "cross-country":
                taxJuniors = juniors * 8;
                taxSeniors = seniors * 9.50;

                if (totalJuniorsAndSeniors >= 50) {
                    totaltax *= 20 / 100;

                }

                break;

            case "downhill":
                taxJuniors = juniors * 12.25;
                taxSeniors = seniors * 13.75;

                break;

            case "road":
                taxJuniors = juniors * 20;
                taxSeniors = seniors * 21.50;

                break;

        }
        totaltax = taxJuniors + taxSeniors;
        finalsum = (totaltax * 5) / 100;
        totalcharity = totaltax - finalsum;

        System.out.printf("%.2f", totalcharity);

    }
}
