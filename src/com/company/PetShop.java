package com.company;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double dogfoodpack = 2.50;
        int restfromfood = 4;
//        System.out.println("Please enter number of pack of \"dogfood\" for the day");
//        int numberofpacks = Integer.parseInt(scr.nextLine());
//        double numberoftotaldogfoodexpense = (int) (numberofpacks * dogfoodpack) + restfromfood;
//        System.out.printf("Your total expenses are:%.2f",numberoftotaldogfoodexpense);
        int numberofdogs = Integer.parseInt(scr.nextLine());
        int numberofotheranimals = Integer.parseInt(scr.nextLine());
        double totalexpenses = ((numberofdogs * dogfoodpack) + (numberofotheranimals * restfromfood));
        System.out.printf("Your total expenses are %.2f:",totalexpenses);


    }
}
