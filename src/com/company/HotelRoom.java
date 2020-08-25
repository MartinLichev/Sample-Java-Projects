package com.company;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String month = scr.nextLine();
        int totalNights = Integer.parseInt(scr.nextLine());
        double finalPriceStudio = 0;
        double finalPriceApartment = 0;
        double totalPriceStudio = 0;
        double totalPriceApartment = 0;
        if(month.equals("May") || (month.equals("October"))){
            totalPriceStudio = 50 * totalNights;
            totalPriceApartment = 65 * totalNights;
            if((totalNights > 7) && (totalNights <= 14)){
                finalPriceStudio = totalPriceStudio - (totalPriceStudio * 5) / 100;

            }else if(totalNights > 14){
                finalPriceStudio = totalPriceStudio - (totalPriceStudio * 30) / 100;
                finalPriceApartment = totalPriceApartment - (totalPriceApartment * 10) / 100;

            }else{
                finalPriceStudio = totalPriceStudio;
                finalPriceApartment = totalPriceApartment;
            }

        }else if((month.equals("June")) || (month.equals("September"))){
            totalPriceStudio = 75.20 * totalNights;
            totalPriceApartment = 68.70 * totalNights;
            if(totalNights > 14){
                finalPriceStudio = totalPriceStudio - (totalPriceStudio * 20) / 100;
                finalPriceApartment = totalPriceApartment - (totalPriceApartment * 10) / 100;

            }else{
                finalPriceStudio = totalPriceStudio;
                finalPriceApartment = totalPriceApartment;
            }

        }else if((month.equals("July")) || (month.equals("August"))){
            totalPriceStudio = 76 * totalNights;
            totalPriceApartment = 77 * totalNights;
            if(totalNights > 14){
                finalPriceApartment = totalPriceApartment - (totalPriceApartment * 10) / 100;
                finalPriceStudio = totalPriceStudio;

            }else{
                finalPriceStudio = totalPriceStudio;
                finalPriceApartment = totalPriceApartment;
            }

        }
        System.out.printf("Apartment: %.2f lv.",finalPriceApartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", finalPriceStudio);

    }
}

