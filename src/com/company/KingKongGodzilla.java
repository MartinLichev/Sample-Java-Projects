package com.company;

import java.util.Scanner;

public class KingKongGodzilla {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double budget = Double.parseDouble(scr.nextLine());
        int actors = Integer.parseInt(scr.nextLine());
        double priceCostumeOfActor = Double.parseDouble(scr.nextLine());
        double decor = (budget * 10) / 100;
        double totalPriceActors = actors * priceCostumeOfActor;
        double totalCosts = totalPriceActors + decor;
        if(actors > 150)
            totalPriceActors = totalPriceActors - 0.10;
        if(totalCosts > budget){
            System.out.printf("Not enough money!");
            System.out.println();
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(totalCosts - budget));
        }else if(totalCosts <= budget){
            System.out.printf("Action!");
            System.out.println();
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(totalCosts - budget));
        }
    }
}

