package com.company;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int hrizantemi = Integer.parseInt(scr.nextLine());
        int roses = Integer.parseInt(scr.nextLine());
        int tulips = Integer.parseInt(scr.nextLine());
        String season = scr.nextLine();
        Character holidayornot = scr.next().charAt(0);
        int totalPriceFlowers = 0;
        double priceHrizantemi = 0;
        double priceRoses = 0;
        double priceTulips = 0;
        double totalPrice = 0;
        switch (season) {
            case "Spring":
            case "Summer":
                priceHrizantemi = hrizantemi * 2.00;
                priceRoses = roses * 4.10;
                priceTulips = tulips * 2.50;
                totalPrice = priceHrizantemi + priceRoses + priceTulips;

                if (holidayornot.equals('y')) {
                    totalPrice += 0.15 / 100;
                    if (tulips > 7) {
                        totalPrice *= 0.5 / 100;
                    }
                }
                if (hrizantemi + roses + tulips > 20) {
                    totalPrice *= 0.20 / 100;

                }

                totalPrice += 2;

                break;

            case "Autumn":
            case "Winter":
                priceHrizantemi = hrizantemi * 3.75;
                priceRoses = roses * 4.50;
                priceTulips = tulips * 4.15;
                totalPrice = priceHrizantemi + priceRoses + priceTulips;

                if (holidayornot.equals('y')) {
                    totalPrice *= 0.15 / 100;
                    if (roses >= 10) {
                        totalPrice *= 0.10 / 100;

                    }
                }

                if (hrizantemi + roses + tulips > 20) {
                    totalPrice *= 0.20 / 100;

                }

                totalPrice += 2;

                break;

        }

        System.out.printf("%.2f", totalPrice);
    }
}
