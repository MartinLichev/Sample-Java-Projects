package com.company;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble(scr.nextLine());
        double year = Integer.parseInt(scr.nextLine());
        double totalSpendings = 0;
        double age = 18;
        double moneyleft = 0;


        for(int a = 1800; a <= year; a++){

            if(a % 2 == 0){
                totalSpendings = totalSpendings + 12000;
                moneyleft = inheritedMoney - totalSpendings;


            }else if(a % 2 == 1){
                age++;
                totalSpendings = (totalSpendings + 12000) + (50 * age);
                moneyleft = inheritedMoney - totalSpendings;

            }

        }

        if(totalSpendings <= inheritedMoney){
            System.out.printf("Yes, he will live a carefree life and will have %.2f dollars left.", Math.abs(totalSpendings - inheritedMoney));


        }else if(totalSpendings > inheritedMoney){
            System.out.printf("He will need %.2f money to survive!", Math.abs(totalSpendings - inheritedMoney));


        }
    }
}
