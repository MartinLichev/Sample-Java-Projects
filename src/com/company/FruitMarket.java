package com.company;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
//        Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
//        2. Количеството бананите в килограми – реално число в интервала [0.00 … 10000.00]
//        3. Количеството портокалите в килограми – реално число в интервала [0.00 … 10000.00]
//        4. Количеството малините в килограми – реално число в интервала [0.00 … 10000.00]
//        5. Количеството ягодите в килограми – реално число в интервала [0.00 … 10000.00]
        double strawberryprice = Double.parseDouble(scr.nextLine());
        double bananaquantity = Double.parseDouble(scr.nextLine());
        double orangesquantity = Double.parseDouble(scr.nextLine());
        double blueberryquantity = Double.parseDouble(scr.nextLine());
        double strawberryquantity = Double.parseDouble(scr.nextLine());
        double blueberryprice = strawberryprice - strawberryprice * 0.50;
        double oragnesprice = blueberryprice - blueberryprice * 0.40;
        double bananasprice = blueberryprice - blueberryprice * 0.80;
        double sumtotal = blueberryprice + oragnesprice + bananasprice + strawberryprice;
        System.out.printf("%.2f",sumtotal);
    }

}
