package com.company;

import java.util.Scanner;

public class Numbers1ToNInThree {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int input = Integer.parseInt(scr.nextLine());

        for(int a = 1; a <= input; a++){
            if(a % 3 == 0){
                System.out.println(a);
            }
        }
    }
}
