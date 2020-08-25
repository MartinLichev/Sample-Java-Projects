package com.company;

import java.util.Scanner;

public class VegatablesMarket {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double oneEuroToLeva = 1.94;
        double priceKgsVeggies = Double.parseDouble(scr.nextLine());
        double priceKgsFruits = Double.parseDouble(scr.nextLine());
        double totalKgsVeggies = Double.parseDouble(scr.nextLine());
        double totalKgsFruits = Double.parseDouble(scr.nextLine());
        double totalcostFruitsAndVeggies = ((priceKgsVeggies * totalKgsVeggies) + (priceKgsFruits * totalKgsFruits));
        double totalcostInEuro = totalcostFruitsAndVeggies / oneEuroToLeva;
        System.out.println(totalcostInEuro);

    }
}

