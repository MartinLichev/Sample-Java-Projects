package com.company;

import java.util.Scanner;

public class TheBiggerNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = Integer.parseInt(scr.nextLine());
        int b = Integer.parseInt(scr.nextLine());
        if( a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
