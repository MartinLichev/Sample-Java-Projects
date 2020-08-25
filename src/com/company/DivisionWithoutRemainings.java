package com.company;

import java.util.Scanner;

public class DivisionWithoutRemainings {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double numbers = Double.parseDouble(scr.nextLine());
        double sumModulisTwo = 0;
        double sumModulisThree = 0;
        double sumModulisFour = 0;

        for(int a = 1; a <= numbers; a++){
            double n = Double.parseDouble(scr.nextLine());

            if( n % 2 == 0){

                sumModulisTwo++;

            }if( n % 3 == 0){

                sumModulisThree++;


            }if(n % 4 == 0){

                sumModulisFour++;

            }
        }

        double percentageTwo = (sumModulisTwo / numbers) * 100;
        double percentageThree = (sumModulisThree / numbers) * 100;
        double percentageFour = (sumModulisFour / numbers) * 100;

        System.out.printf("%.2f", percentageTwo);
        System.out.println();
        System.out.printf("%.2f",percentageThree);
        System.out.println();
        System.out.printf("%.2f",percentageFour);
        System.out.println();
    }
}
