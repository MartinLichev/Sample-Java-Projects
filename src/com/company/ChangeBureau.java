package com.company;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int bitcoins = Integer.parseInt(scr.nextLine());
        double chineeseYan = Double.parseDouble(scr.nextLine());
        double commision = Double.parseDouble(scr.nextLine());
        double totalbitcoinsInLev = bitcoins * 1168;
        double totalchineeseYanInDollars = chineeseYan * 0.15;
        double dollarsToLev = totalchineeseYanInDollars * 1.76;
        double TotalSum = totalbitcoinsInLev + dollarsToLev;
        double LevToEuro = TotalSum * 1.95;
        double totalWithCommision = LevToEuro - (LevToEuro * commision) / 100;

        System.out.println(totalWithCommision);
    }
}
