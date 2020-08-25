package com.company;

import java.util.Scanner;

public class MinAndMaxNumberForLoop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = Integer.parseInt(scr.nextLine());
        int max = 0;
        int min = 0;

        for(int a = 0; a < n; a++){
            int input = Integer.parseInt(scr.nextLine());
            if(input > max){
                max = input;
            }else{
                min = input;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
