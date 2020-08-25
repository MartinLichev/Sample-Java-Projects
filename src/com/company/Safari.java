package com.company;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double fuelPrice = 2.10;
        int priceTourGuide = 100;
        double totalCosts = 0;

        double budget = Double.parseDouble(scr.nextLine());
        double litresfuel = Double.parseDouble(scr.nextLine());
        double fuelCosts = litresfuel * fuelPrice;
        totalCosts = fuelCosts + priceTourGuide;
        String dayOfTheWeek = scr.nextLine();

        switch(dayOfTheWeek){
            case "Saturday":
                totalCosts = totalCosts - (totalCosts * 10 ) / 100;
                break;
            case "Sunday":
                totalCosts = totalCosts - (totalCosts * 20) / 100;
                break;
            default:
                System.out.println("Error, please input \"string\" again!");
        }

        if(totalCosts <= budget){
            System.out.printf("Safari time! Money left:%.2f lv", Math.abs(totalCosts - budget));
        }else{
            System.out.printf("Not enough money! Money needed:%.2f lv", Math.abs(totalCosts - budget));
        }
    }
}
