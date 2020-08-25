package com.company;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double vacationprice = Double.parseDouble(scr.nextLine());
        int puzzlespack = Integer.parseInt(scr.nextLine());
        int dolls = Integer.parseInt(scr.nextLine());
        int teddybears = Integer.parseInt(scr.nextLine());
        int minions = Integer.parseInt(scr.nextLine());
        int trucks = Integer.parseInt(scr.nextLine());
        double countofalltoys = puzzlespack + dolls + teddybears + minions + trucks;
        double sum = (puzzlespack * 2.60) + (dolls * 3.00) + (teddybears * 4.10) + (minions * 8.20) + (trucks * 2.00);
        double discount = 0;
        double endcost = 0;
        double rent = 0;
        double profit = 0;
        if(sum >= 50){
            discount = (sum * 25) / 100;
            endcost = sum - discount;
            rent = (endcost * 10) / 100;
            profit = endcost - rent;
        }else if (sum < 50){
            endcost = sum;
            rent = (endcost * 10) / 100;
            profit = endcost - rent;
        }

        if(profit >= vacationprice){
            System.out.printf("Yes! %.2f remaining", (profit - vacationprice));
        }else if(profit < vacationprice){
            System.out.printf("No! %.2f needed",(vacationprice - profit));

        }

    }
}


