package com.company;

import java.util.Scanner;

public class EvenAndOddSum {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int numbers = Integer.parseInt(scr.nextLine());
        int evensum = 0;
        int oddsum = 0;

        for(int a = 1; a <= numbers; a++){

            int n = Integer.parseInt(scr.nextLine());

            if(a % 2 == 0){

                evensum = evensum + n;

            }else{

                oddsum = oddsum + n;
            }
        }

        if(evensum == oddsum){

            System.out.printf("Yes, - %d", evensum);

        }else if(evensum != oddsum){

            System.out.printf("No, - %d", Math.abs(oddsum - evensum));
        }
    }
}
