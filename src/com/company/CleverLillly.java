package com.company;

import java.util.Scanner;

public class CleverLillly {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int lillyAge = Integer.parseInt(scr.nextLine());
        double washingMachinePrice = Double.parseDouble(scr.nextLine());
        int priceToy = Integer.parseInt(scr.nextLine());
        double moneyPerYear = 0;
        double sumMoney = 0;
        double numberOfToys = 0;
        double sumToys = 0;

        for (int a = 1; a <= lillyAge; a++) {

            if (a % 2 == 1) {

                numberOfToys++;

            } else if (a % 2 == 0) {

                moneyPerYear = moneyPerYear + 10;
                sumMoney = sumMoney + moneyPerYear;
                sumMoney = sumMoney - 1;

            }

        }
        sumToys = numberOfToys * priceToy;
        double totalSavings = sumToys + sumMoney;

        if(totalSavings <= washingMachinePrice) {


            System.out.printf("No! %.2f", Math.abs(totalSavings - washingMachinePrice));

        }else if(totalSavings >= washingMachinePrice){

            System.out.printf("Yes! %.2f", Math.abs(totalSavings - washingMachinePrice));
        }

    }
}



