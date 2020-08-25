package com.company;

import java.util.Scanner;

public class SkiVacation {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int daysOfRent = Integer.parseInt(scr.nextLine());
        String typeOfRoom = scr.nextLine();
        String grade = scr.nextLine();
        double totalNights = daysOfRent - 1;
        double stay = 0;
        double totalRentWithDiscount = 0;
        double finalRentWithDiscount = 0;
        if(typeOfRoom.equals("room for one person")){
            if(daysOfRent < 10){
                stay += totalNights * 18;
            }if((daysOfRent >= 10) && (daysOfRent <= 15)){
                stay += totalNights * 18;
            }if(daysOfRent > 15){
                stay += totalNights * 18;
            }

        }else if(typeOfRoom.equals("apartment")){
            if(daysOfRent < 10){
                stay += totalNights * 25;
                totalRentWithDiscount = stay - (stay * 30) / 100;
            }if((daysOfRent >= 10) && (daysOfRent <= 15)){
                stay += totalNights * 25;
                totalRentWithDiscount = stay - (stay * 35) / 100;
            }if(daysOfRent > 15){
                stay += totalNights * 25;
                totalRentWithDiscount = stay - (stay * 50) / 100;
            }

        }else if(typeOfRoom.equals("president apartment")){
            if(daysOfRent < 10){
                stay += totalNights * 30;
                totalRentWithDiscount = stay - (stay * 10) / 100;
            }if((daysOfRent >= 10) && (daysOfRent <= 15)){
                stay += totalNights * 30;
                totalRentWithDiscount = stay - (stay * 15) / 100;
            }if(daysOfRent > 15){
                stay += totalNights * 30;
                totalRentWithDiscount = stay - (stay * 20) / 100;
            }

        }else{
            System.out.println("Incorrect value, entered!");
        }
        if(grade.equals("positive")){
            finalRentWithDiscount = totalRentWithDiscount + (totalRentWithDiscount * 25) / 100;
            System.out.printf("%.2f",finalRentWithDiscount);
        }else if(grade.equals("negative")){
            finalRentWithDiscount = totalRentWithDiscount - (totalRentWithDiscount * 10) /100;
            System.out.printf("%.2f",finalRentWithDiscount);
        }
    }

}
