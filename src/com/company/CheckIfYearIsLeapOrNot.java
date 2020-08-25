package com.company;

import java.util.Scanner;

public class CheckIfYearIsLeapOrNot {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int year = Integer.parseInt(scr.nextLine());
        if(year % 4 == 0){
            System.out.println("leap");

        }else{
            System.out.println("normal");
        }
    }
}
