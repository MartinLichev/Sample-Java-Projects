package com.company;

import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double budget = Double.parseDouble(scr.nextLine());
        String season = scr.nextLine().toLowerCase();
        String destination = "";
        String placeToStay = "";
        double totalSum = 0;
        if (budget <= 100) {
            destination = "Bulgaria";
            if(season.equals("summer")){
                totalSum = (budget * 30) / 100;
                placeToStay = "Camp";
                System.out.printf("Somewhere in %s", destination);
                System.out.println();
                System.out.printf("%s - %.2f", placeToStay, totalSum);

            }else if(season.equals("winter")){
                totalSum = (budget * 70) / 100;
                placeToStay = "Hotel";
                System.out.printf("Somewhere in %s", destination);
                System.out.println();
                System.out.printf("%s - %.2f", placeToStay, totalSum);

            }

        } else if ((budget > 100) && (budget <= 1000)) {
            destination = "Balkans";
            if(season.equals("summer")){
                totalSum = (budget * 40) / 100;
                placeToStay = "Camp";
                System.out.printf("Somewhere in %s", destination);
                System.out.println();
                System.out.printf("%s - %.2f", placeToStay, totalSum);

            }else if(season.equals("winter")){
                totalSum = (budget * 80) / 100;
                placeToStay = "Hotel";
                System.out.printf("Somewhere in %s", destination);
                System.out.println();
                System.out.printf("%s - %.2f", placeToStay, totalSum);

            }

        } else if (budget > 1000) {
            destination = "Europe";
            placeToStay = "Hotel";
            totalSum = (budget - 90 ) / 100;
            if(season.equals("summer")){
                System.out.printf("Somewhere in %s", destination);
                System.out.println();
                System.out.printf("%s - %.2f", placeToStay, totalSum);

            }else if(season.equals("winter")){
                System.out.printf("Somewhere in %s", destination);
                System.out.println();
                System.out.printf("%s - %.2f", placeToStay, totalSum);

            }


        }
    }
}