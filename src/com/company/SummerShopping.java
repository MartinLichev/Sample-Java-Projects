package com.company;

import java.util.Scanner;

public class SummerShopping {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int budget = Integer.parseInt(scr.nextLine());
        double priceBeachTowel = Double.parseDouble(scr.nextLine());
        int discount = Integer.parseInt(scr.nextLine());
        double priceSummerUmbrella = (2 / 3 ) * priceBeachTowel;
        double priceFlipFlops = (priceSummerUmbrella * 75) / 100;
        double sumFlipFlopsAndBeachTowel = priceFlipFlops + priceBeachTowel;
        double beachBag = (1 / 3 ) * sumFlipFlopsAndBeachTowel;
        double sumTotal = beachBag + priceFlipFlops + priceSummerUmbrella + priceBeachTowel;
        double sumwithdiscount = sumTotal - (sumTotal * discount) / 100;

        if(sumwithdiscount <= budget){
            System.out.printf("Annie's sum is %.2f lv. She has %.2f leva left.", sumwithdiscount, Math.abs(sumwithdiscount - budget));

        }else if(sumwithdiscount > budget){
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f leva more.", sumwithdiscount, Math.abs(sumwithdiscount - budget));

        }
    }
}
