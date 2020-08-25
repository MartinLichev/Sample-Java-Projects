package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Commisions {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        String name = scr.nextLine();
        double sale = Double.parseDouble(scr.nextLine());
        double commision = 0;
        if (name.equals("Sofia")) {
            if ((sale >= 0) && (sale <= 500)) {
                commision = (sale * 5) / 100;
                System.out.println(commision);
            }
            if ((sale > 500) && (sale <= 1000)) {
                commision = (sale * 7) / 100;

                System.out.println(commision);
            }
            if ((sale > 1000) && (sale <= 10000)) {
                commision = (sale * 8) / 100;
                System.out.println(commision);
            }
            if ((sale > 10000)) {
                commision = (sale * 12) / 100;
                System.out.println(commision);
            }
        } else if (name.equals("Varna")) {
            if ((sale >= 0) && (sale <= 500)) {
                commision = (sale * 4.5) / 100;
                System.out.println(commision);
            }
            if ((sale > 500) && (sale <= 1000)) {
                commision = (sale * 7.5) / 100;
                System.out.println(commision);
            }
            if ((sale > 1000) && (sale <= 10000)) {
                commision = (sale * 10) / 100;
                System.out.println(commision);
            }
            if ((sale > 10000)) {
                commision = (sale * 13) / 100;
                System.out.println(commision);
            }
        } else if (name.equals("Plovdiv")) {
            if ((sale >= 0) && (sale <= 500)) {
                commision = (sale * 5.5) / 100;
                System.out.println(commision);
            }
            if ((sale > 500) && (sale <= 1000)) {
                commision = (sale * 8) / 100;
                System.out.println(commision);
            }
            if ((sale > 1000) && (sale <= 10000)) {
                commision =(sale * 12) / 100;
                System.out.println(commision);
            }
            if ((sale > 10000)) {
                commision = (sale * 14.5) / 100;
                System.out.println(commision);
            }
        }else{
            System.out.println("error!");
        }
    }
}
