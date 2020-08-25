package com.company;

import java.util.Scanner;

public class GroceriesStore {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String fruit = scr.nextLine();
        String dayOfWeek = scr.nextLine();
        double quantity = Double.parseDouble(scr.nextLine());
        double sum = 0;
        if((dayOfWeek.equals("Monday")) || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")){
            if(fruit.equals("banana")){
                sum = quantity * 2.50;
            }
            if(fruit.equals("apple")){
                sum = quantity * 1.20;
            }
            if(fruit.equals("orange")){
                sum = quantity * 0.85;
            }
            if(fruit.equals("grapefruit")){
                sum = quantity * 1.45;
            }
            if(fruit.equals("kiwi")){
                sum = quantity * 2.70;
            }
            if(fruit.equals("pineapple")){
                sum = quantity * 5.50;
            }
            if(fruit.equals("grapes")){
                sum = quantity * 3.85;
            }
        }else if((dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday"))){
            if (fruit.equals("banana")) {
                sum = quantity * 2.70;
            }
            if (fruit.equals("apple")) {
                sum = quantity * 1.25;
            }
            if (fruit.equals("orange")) {
                sum = quantity * 0.90;
            }
            if (fruit.equals("grapefruit")) {
                sum = quantity * 1.60;
            }
            if (fruit.equals("kiwi")) {
                sum = quantity * 3.00;
            }
            if (fruit.equals("pineapple")) {
                sum = quantity * 5.60;
            }
            if (fruit.equals("grapes")) {
                sum = quantity * 4.20;
            }
        }else{
            System.out.println("Error!");
        }
        System.out.println(sum);
    }
}

