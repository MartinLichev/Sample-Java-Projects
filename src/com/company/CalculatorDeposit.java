package com.company;

import java.util.Scanner;

public class CalculatorDeposit {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double depositsum = Double.parseDouble(scr.nextLine());
        int depositlength = Integer.parseInt(scr.nextLine());
        double yeardepositpercentage = Double.parseDouble(scr.nextLine());
        double totalinterest = (depositsum * yeardepositpercentage) / 100;
        double interestforonemonth = totalinterest / 12;
        double totalsumdeposit = (depositsum + depositlength) * interestforonemonth;
        System.out.println(totalsumdeposit);

    }
}
