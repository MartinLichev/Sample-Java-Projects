package com.company;

import java.util.Scanner;

public class WhileLoopUserAndPassword {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String user = scr.nextLine();

        String pass = scr.nextLine();

        String atempt = scr.nextLine();

        while(!atempt.equals(pass)){

            System.out.println("WRONG INPUT! PLEASE TRY AGAIN!");

            atempt = scr.nextLine();

            if(atempt.equals(pass)){

                System.out.println("WELCOME!");
            }
        }
    }
}
