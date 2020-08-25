package com.company;

import java.util.Scanner;

public class StringVowelsCountAndSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();
        int count = 0;
        for(int a = 0; a < input.length(); a++){
            if(input.charAt(a) == 'a' || input.charAt(a)== 'e' || input.charAt(a) == 'i' || input.charAt(a) == 'o' || input.charAt(a) == 'u'){

                count ++;

            }
        }
        System.out.println(count);
    }
}
