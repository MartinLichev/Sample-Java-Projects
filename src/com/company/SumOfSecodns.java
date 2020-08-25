package com.company;

import java.util.Scanner;

public class SumOfSecodns {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int firstnumber = Integer.parseInt(scr.nextLine());
        int secondtnumber = Integer.parseInt(scr.nextLine());
        int thirdnumber = Integer.parseInt(scr.nextLine());
        int sumofnumbers = firstnumber + secondtnumber + thirdnumber;
        int minutes = sumofnumbers / 60;
        int seconds = sumofnumbers % 60;

        if(seconds < 10){
            System.out.printf("%d:0%d",minutes,seconds);
        }else{
            System.out.printf("%d:%d",minutes,seconds);
        }

    }
}
