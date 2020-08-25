package com.company;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double priceFlour = Double.parseDouble(scr.nextLine());
        double kgFlour = Double.parseDouble(scr.nextLine());
        double kgSugar = Double.parseDouble(scr.nextLine());
        int packOfEggs = Integer.parseInt(scr.nextLine());
        int packsOfMaia = Integer.parseInt(scr.nextLine());
        double totalPriceFlour = kgFlour * priceFlour;
        double priceSugar = priceFlour - (priceFlour * 25) / 100;
        double pricePackOfEggs = priceFlour + (priceFlour * 10) / 100;
        double pricePackOfMaia = priceSugar - (priceSugar * 80) / 100;
        double totalPriceSugar = priceSugar * kgSugar;
        double totalPriceEggs = pricePackOfEggs * packOfEggs;
        double totalPriceMaia = pricePackOfMaia * packsOfMaia;
        double totalSum = totalPriceEggs + totalPriceSugar + totalPriceMaia + totalPriceFlour;
        System.out.printf("%.2f", totalSum);


    }
}
