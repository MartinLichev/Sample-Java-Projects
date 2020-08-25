package com.company;

import java.util.Scanner;

public class MagicNumber {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scr.nextLine());

        int intervalEnd = Integer.parseInt(scr.nextLine());

        int magicNumber = Integer.parseInt(scr.nextLine());

        for(int i = intervalStart; i <= intervalEnd; i++){

            for(int j = intervalStart; j <= intervalEnd; j++){

//                System.out.printf("i = %d, j = %d%n", i, j);
                int sum = i + j;

                if(sum == magicNumber){


                }

            }

        }
    }
}
