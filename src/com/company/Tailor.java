package com.company;

import java.util.Scanner;

public class Tailor {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numberoftables = Integer.parseInt(scr.nextLine());
        double tableslength = Double.parseDouble(scr.nextLine());
        double tableswidth = Double.parseDouble(scr.nextLine());
        double tableclothlength = ( 2 * tableslength )+ 30;
        double tableclothwidth = ( 2 * tableswidth ) + 30;
        double squareclothlengthandwidth = tableslength /2;
        //double squreclothwidth = tableswidth /2;
        double metercloth = 7;
        double metersquarecloth = 9;
        double tableclothvolume = 2 * (tableclothlength+tableclothwidth);
        double squareclothvolume = 4 * squareclothlengthandwidth;
        System.out.printf("All your expenses are:%.2f");

    }
}
