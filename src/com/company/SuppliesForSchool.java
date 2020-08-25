package com.company;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numberOfPens = Integer.parseInt(scr.nextLine());
        int numberOfMarkers = Integer.parseInt(scr.nextLine());
        double totalLitersSpray = Double.parseDouble(scr.nextLine());
        int procentDiscount = Integer.parseInt(scr.nextLine());
        double costPens = numberOfPens * 5.80;
        double costMarkers = numberOfMarkers * 7.20;
        double costSpray = totalLitersSpray * 1.20;
        double totalcosts = costPens + costMarkers + costSpray;
        double totalCostsWithDiscount = totalcosts - (totalcosts * procentDiscount) / 100;

        System.out.printf("%.3f",totalCostsWithDiscount);
    }
}
