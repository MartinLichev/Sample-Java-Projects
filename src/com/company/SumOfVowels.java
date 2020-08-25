package com.company;

import java.util.Scanner;

public class SumOfVowels {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();
        int sum = 0;
        for(int a = 0; a < input.length(); a++){

            switch(input.charAt(a)){
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
                case 'i':
                    sum += 3;
                    break;

            }
        }

        System.out.println(sum);
    }
}
