package com.company;

import java.util.Scanner;

public class SmallestNumberWhileLoop {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        String input = scr.nextLine();

        int min = Integer.MAX_VALUE;

        while(!input.equals("Stop")){

            int number = Integer.parseInt(input);

            if(number < min){

                min = number;
            }
            input = scr.nextLine();

        }

        System.out.println(min);
    }
}
