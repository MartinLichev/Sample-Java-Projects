package com.company;

import java.util.Scanner;

public class NumsConcludingOn7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = Integer.parseInt(scr.nextLine());

        for(int a = 1; a <= n; a++){

            if(a % 10 == 7){

                System.out.println(a);
            }

        }
    }
}
