package com.company;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number = Integer.parseInt(scr.nextLine());
        boolean valid = ((number >= 100) && (number <= 200) || (number == 0));
        if((number >= 100) && (number <= 200) || (number == 0)){
            System.out.println();
        }else if(!valid){
            System.out.println("Invalid!");
        }
    }
}
