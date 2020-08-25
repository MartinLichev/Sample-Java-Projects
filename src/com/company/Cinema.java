package com.company;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String typeOfFilm = scr.nextLine();
        int rows = Integer.parseInt(scr.nextLine());
        int columns = Integer.parseInt(scr.nextLine());
        int totalnumbers = rows * columns;
        double income = 0;
        if(typeOfFilm.equals("Premiere")){
            income = totalnumbers * 12;
            System.out.printf("%.2f",income);

        }else if(typeOfFilm.equals("Normal")){
            income = totalnumbers * 7.5;
            System.out.printf("%.2f",income);

        }else if(typeOfFilm.equals("Discount")){
            income = totalnumbers * 5;
            System.out.printf("%.2f",income);

        }else{
            System.out.println("Incorrect format, please try again!");
        }
    }
}
