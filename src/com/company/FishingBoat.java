package com.company;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double budget = Integer.parseInt(scr.nextLine());
        String season = scr.nextLine();
        double numberOfSailoirs = Integer.parseInt(scr.nextLine());
        double boatRent = 0;
        if(season.equals("Spring")){
            boatRent = 3000;
            if(numberOfSailoirs <= 6){
                boatRent = boatRent - (boatRent * 10) / 100;
            }if((numberOfSailoirs >= 7) && (numberOfSailoirs <= 11)){
                boatRent = boatRent - (boatRent * 15) / 100;
            }if(numberOfSailoirs >= 12){
                boatRent = boatRent - (boatRent * 25) / 100;
            }if(numberOfSailoirs % 2 == 0){
                boatRent = boatRent - (boatRent * 5) / 100;
            }
        }else if(season.equals("Summer")){
            boatRent = 4200;
            if(numberOfSailoirs <= 6){
                boatRent = boatRent - (boatRent * 10) / 100;
            }if((numberOfSailoirs >= 7) && (numberOfSailoirs <= 11)){
                boatRent = boatRent - (boatRent * 15) / 100;
            }if(numberOfSailoirs >= 12){
                boatRent = boatRent - (boatRent * 25) / 100;
            }if(numberOfSailoirs % 2 == 0){
            boatRent = boatRent - (boatRent * 5) / 100;
        }
        }else if(season.equals("Autumn")){
            boatRent = 4200;
            if(numberOfSailoirs <= 6){
                boatRent = boatRent - (boatRent * 10) / 100;
            }if((numberOfSailoirs >= 7) && (numberOfSailoirs <= 11)){
                boatRent = boatRent - (boatRent * 15) / 100;
            }if(numberOfSailoirs >= 12){
                boatRent = boatRent - (boatRent * 25) / 100;
            }
        }else if(season.equals("Winter")){
            boatRent = 2600;
            if(numberOfSailoirs <= 6){
                boatRent = boatRent - (boatRent * 10) / 100;
            }if((numberOfSailoirs >= 7) && (numberOfSailoirs <= 11)){
                boatRent = boatRent - (boatRent * 15) / 100;
            }if(numberOfSailoirs >= 12){
                boatRent = boatRent - (boatRent * 25) / 100;
            }if(numberOfSailoirs % 2 == 0){
                boatRent = boatRent - (boatRent * 5) / 100;
            }
        }

        if(boatRent > budget){
            System.out.printf("Not enough money! You need %.2f leva", Math.abs(boatRent - budget));
        }else if(boatRent < budget){
            System.out.printf("Yes! You have %.2f leva left",Math.abs(boatRent - budget));
        }
    }
}
