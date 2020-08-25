package com.company;

import java.util.Scanner;

public class WhileSeriesOfNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int number = Integer.parseInt(scr.nextLine());

        int c = 1;

        while(c <= number){
            System.out.println(c);

            c = (c * 2) + 1;


        }

    }

}
