package com.company;

import java.util.Scanner;

public class FishMarket {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double priceScumria = Double.parseDouble(scr.nextLine());
        double priceTsatsa = Double.parseDouble(scr.nextLine());
        double kgsPalamud = Double.parseDouble(scr.nextLine());
        double kgsSafrid = Double.parseDouble(scr.nextLine());
        double kgsMussels = Double.parseDouble(scr.nextLine());
        double pricePalamud = priceScumria + (priceScumria * 0.60);
        double totalPalamudsPrice = pricePalamud * kgsPalamud;
        double priceSafrid = priceTsatsa + (priceTsatsa * 0.80);
        double totalSafridPrice = priceSafrid * kgsSafrid;
        double priceMussels = kgsMussels * 7.50;
        double totalMoneyNeeded = totalPalamudsPrice + totalSafridPrice + priceMussels;
        System.out.printf("%.2f",totalMoneyNeeded);
    }
}
