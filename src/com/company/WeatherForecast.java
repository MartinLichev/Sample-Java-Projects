package com.company;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();
        switch(input){
            case "sunny":
                System.out.println("It's warm outside!");
            default:
                System.out.println("The weather is cold!");
        }
    }
}
