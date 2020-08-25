package com.company;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String flowers = scr.nextLine();
        int numberOfFlowers = Integer.parseInt(scr.nextLine());
        int budget = Integer.parseInt(scr.nextLine());
        double finalPrice = 0;
        if (flowers.equals("Roses")) {
            double totalPriceRoses = numberOfFlowers * 5;
            finalPrice = totalPriceRoses;
            if (numberOfFlowers > 80) {
                totalPriceRoses = numberOfFlowers * 5;
                finalPrice = totalPriceRoses - (totalPriceRoses * 10) / 100;
            }
        } else if (flowers.equals("Dahlias")) {
            double totalPriceDahlias = numberOfFlowers * 3.80;
            finalPrice = totalPriceDahlias;
            if (numberOfFlowers > 90) {
                totalPriceDahlias = numberOfFlowers * 3.80;
                finalPrice = totalPriceDahlias - (totalPriceDahlias * 15) / 100;
            }
        } else if (flowers.equals("Tulips")) {
            double totalPriceTulips = numberOfFlowers * 2.80;
            finalPrice = totalPriceTulips;
            if (numberOfFlowers > 80) {
                totalPriceTulips = numberOfFlowers * 2.80;
                finalPrice = totalPriceTulips - (totalPriceTulips * 15) / 100;
            }
        } else if (flowers.equals("Narcissus")) {
            double totalPriceNarcissus = numberOfFlowers * 3;
            finalPrice = totalPriceNarcissus;
            if (numberOfFlowers < 120) {
                totalPriceNarcissus = numberOfFlowers * 3;
                finalPrice = totalPriceNarcissus + (totalPriceNarcissus * 15) / 100;
            }
        } else if (flowers.equals("Gladiolus")) {
            double totalPriceGladiolas = numberOfFlowers * 2.50;
            finalPrice = totalPriceGladiolas;
            if (numberOfFlowers < 80) {
                totalPriceGladiolas = numberOfFlowers * 2.50;
                finalPrice = totalPriceGladiolas + (totalPriceGladiolas * 20) / 100;
            }
        }
        if (finalPrice < budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, Math.abs(finalPrice - budget));
        } else if (finalPrice > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(finalPrice - budget));
        }
    }
}

