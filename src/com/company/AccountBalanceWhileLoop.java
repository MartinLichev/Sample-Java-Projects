package com.company;

import java.util.Scanner;

public class AccountBalanceWhileLoop {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String input = scr.nextLine();

        double totalBalance = 0;

        while(!input.equals("No more money!")){

            Double number = Double.parseDouble(input);
            System.out.println("Increase: " + number);
            totalBalance = totalBalance + number;


            if(number < 0){

                System.out.println("Invalid Operation!");

                break;
            }

            input = scr.nextLine();


        }


        System.out.println("Total: " + totalBalance);


    }
}
