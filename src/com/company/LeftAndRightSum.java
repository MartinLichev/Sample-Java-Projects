package com.company;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number = Integer.parseInt(scr.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for(int a = 1; a <= number; a++){
            int n = Integer.parseInt(scr.nextLine());
            sum1 = sum1 + n;

        }

        for(int b = 1; b <= number; b++){
            int m = Integer.parseInt(scr.nextLine());
            sum2 = sum2 + m;
        }

        if(sum1 == sum2){

            System.out.printf("Yes, sum is - %d ", sum1);


        }else if(sum1 != sum2){

            System.out.printf("No, diff is - %d ", Math.abs(sum1 - sum2));

        }

    }
}
