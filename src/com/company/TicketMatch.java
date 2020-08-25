package com.company;

import java.util.Scanner;

public class TicketMatch {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double budget = Double.parseDouble(scr.nextLine());
        String category = scr.nextLine().toLowerCase();
        int numberOfPeople = Integer.parseInt(scr.nextLine());
        double vipTicket = 499.99;
        double normalTicket = 249.99;
        double transportationCosts = 0;
        double totalcosts = 0;
        double finalexpenses = 0;
        switch (category) {
            case "vip":
                if (numberOfPeople <= 4) {
                    transportationCosts = (budget * 75) / 100;
                } else if ((numberOfPeople >= 5) && (numberOfPeople <= 9)) {
                    transportationCosts = (budget * 60) / 100;
                } else if ((numberOfPeople <= 10) && (numberOfPeople <= 24)) {
                    transportationCosts = (budget * 50) / 100;
                } else if ((numberOfPeople >= 25) && (numberOfPeople <= 49)) {
                    transportationCosts = (budget * 40) / 100;
                } else if (numberOfPeople >= 50) {
                    transportationCosts = (budget * 25) / 100;
                }
                totalcosts = vipTicket * numberOfPeople;
                finalexpenses = totalcosts + transportationCosts;

                break;
            case "normal":
                if (numberOfPeople <= 4) {
                    transportationCosts = (budget * 75) / 100;
                } else if ((numberOfPeople >= 5) && (numberOfPeople <= 9)) {
                    transportationCosts = (budget * 60) / 100;
                } else if ((numberOfPeople <= 10) && (numberOfPeople <= 24)) {
                    transportationCosts = (budget * 50) / 100;
                } else if ((numberOfPeople >= 25) && (numberOfPeople <= 49)) {
                    transportationCosts = (budget * 40) / 100;
                } else if (numberOfPeople >= 50) {
                    transportationCosts = (budget * 25) / 100;
                }
                totalcosts = normalTicket * numberOfPeople;
                finalexpenses = totalcosts + transportationCosts;

                break;
        }

        if (finalexpenses <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(finalexpenses - budget));

        } else if (finalexpenses > budget) {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(finalexpenses - budget));

        }
    }
}



