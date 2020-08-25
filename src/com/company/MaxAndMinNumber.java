package com.company;

import java.util.Scanner;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numbers = Integer.parseInt(scr.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int a = 1; a <= numbers; a++){
            int n = Integer.parseInt(scr.nextLine());

            if(n > max){
                max = n;
            }else if(n < min){
                min = n;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
