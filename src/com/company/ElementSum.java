package com.company;

import java.util.Scanner;

public class ElementSum {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int numbers = Integer.parseInt(scr.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int sumWithoutMaxNumber = sum - max;

        for(int a = 1; a <= numbers; a++){

            int n = Integer.parseInt(scr.nextLine());

            sum = sum + n;

            if( n > max){

                max = n;
            }

        }

        if( max == sumWithoutMaxNumber){
            System.out.println("YES");
            System.out.println(max);

        }else{
            System.out.println("NO");
            System.out.printf("Diff - %d", Math.abs(sumWithoutMaxNumber - max));

        }


    }
}
