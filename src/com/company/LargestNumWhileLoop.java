package com.company;

import java.util.Scanner;

public class LargestNumWhileLoop {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String input = scr.nextLine();

        int max = 0;

        while(!input.equals("Stop")){
            int number = Integer.parseInt(input);

            if(number > max){

                max = number;
            }

            input = scr.nextLine();
        }

        System.out.println(max);
    }
}
