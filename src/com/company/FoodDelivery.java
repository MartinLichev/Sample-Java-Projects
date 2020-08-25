package com.company;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double delivery = 2.50;
        int chickenmenus = Integer.parseInt(scr.nextLine());
        int fishmenus = Integer.parseInt(scr.nextLine());
        int vegetarianMenus = Integer.parseInt(scr.nextLine());

        double totalpriceChickenMenus = chickenmenus * 10.35;
        double totalpriceFishMenus = fishmenus * 12.40;
        double  totalpriceVegetarianMenus = vegetarianMenus * 8.15;

        double totalMenusPrice = totalpriceChickenMenus + totalpriceFishMenus + totalpriceVegetarianMenus;
        double priceDesert = (totalMenusPrice * 20) / 100;
        double finalPrice = priceDesert + totalMenusPrice + delivery;

        System.out.printf("%.2f", finalPrice);

    }
}
