package com.company;

import java.util.Scanner;

public class Income {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int monthlyWorkingDays = Integer.parseInt(scanner.nextLine());

        double earnedMoneyPerDay = Double.parseDouble(scanner.nextLine());

        double courseDollar = Double.parseDouble(scanner.nextLine());

        double earnedMoneyPerMonth = earnedMoneyPerDay * monthlyWorkingDays;

        double annualEarnedMoneyInUSD = (earnedMoneyPerMonth * 12) + (earnedMoneyPerMonth * 2.5);

        double annualProfitAfterTaxing = annualEarnedMoneyInUSD * 0.25;

        double annualNetProfit = Math.abs(annualProfitAfterTaxing - annualEarnedMoneyInUSD);

        double annualProfitBGN = annualNetProfit / courseDollar;

        System.out.printf("Annual Profit:%.2f", annualProfitBGN);

    }
}
