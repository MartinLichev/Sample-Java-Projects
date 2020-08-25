package com.company;

import java.util.Scanner;

public class JessyTrip {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        double moneyForVacation = Double.parseDouble(scr.nextLine());

        double currentMoney = Double.parseDouble(scr.nextLine());

        int days = 0;

        String action = " ";
        
        boolean hasSucceded = true;

        while(currentMoney < moneyForVacation){

            String input = scr.nextLine();

            double sum = Double.parseDouble(scr.nextLine());

            if(input.equals("spend")){

                currentMoney = currentMoney - sum;

//                if();

            }else if(input.equals("save")){

                currentMoney = currentMoney + sum;

            }



            days ++;




        }
    }
}
