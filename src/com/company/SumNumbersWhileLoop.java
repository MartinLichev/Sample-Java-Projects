package com.company;

import java.util.Scanner;

public class SumNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number = Integer.parseInt(scr.nextLine());

        int sum = 0;

        while(true){

            int numbers = Integer.parseInt(scr.nextLine());

            sum = sum + numbers;

            if(sum >= number){

                break;
            }
        }

        System.out.println(sum);
    }
}
