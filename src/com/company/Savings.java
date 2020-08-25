package com.company;

import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double monthlyIncome = Double.parseDouble(scr.nextLine());
        int numberOfMonths = Integer.parseInt(scr.nextLine());
        double monthlyNeeds = Double.parseDouble(scr.nextLine());
        double totalIncome = monthlyIncome * 12;
        double rainyDaySavings = monthlyIncome - (monthlyIncome * 30) / 100;
        double savingsForOneMonth = rainyDaySavings - monthlyNeeds;
        double totalSavings = savingsForOneMonth * numberOfMonths;
        double totalSavingsInPercentage = (savingsForOneMonth / monthlyIncome) * 100;
        System.out.printf("She can save %.2f%%", totalSavingsInPercentage);
        System.out.println();
        System.out.printf("%.2f",totalSavings);

    }
}
