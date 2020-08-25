package com.company;

import java.util.Scanner;

public class EvenOrOddPlaces {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numbers = Integer.parseInt(scr.nextLine());
        int oddsum = 0;
        int evensum = 0;
        int oddmax = Integer.MIN_VALUE;
        int oddmin = Integer.MAX_VALUE;
        int evenmax = Integer.MIN_VALUE;
        int evenmin = Integer.MAX_VALUE;

        for(int a = 1; a <= numbers; a++){

            int n = Integer.parseInt(scr.nextLine());

            if( a % 2 == 1){

                oddsum = oddsum + n;

                if( n > oddmax){

                    oddmax = n;

                }else if( n < oddmin){

                    oddmin = n;
                }

            }else if( a % 2 == 0){

                evensum = evensum + n;

                if( n > evenmax){

                    evenmax = n;
                }else if( n < evenmin){

                    evenmin = n;
                }

            }

        }

        System.out.println(oddsum);
        System.out.println(oddmin);
        System.out.println(oddmax);
        System.out.println(evensum);
        System.out.println(evenmin);
        System.out.println(evenmax);

    }
}
