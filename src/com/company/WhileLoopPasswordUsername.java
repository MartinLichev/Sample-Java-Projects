package com.company;

import java.util.Scanner;

public class WhileLoopPasswordUsername {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String password = scr.nextLine();
        String username = scr.nextLine();
        String input = scr.nextLine();

        int totalatemps = 0;

        while(!input.equals(password)){
            System.out.println("Incorrect password, please try again!");
            input = scr.nextLine();

            totalatemps++;

            if(input.equals(password)){

                System.out.println("Welcome " + username + " ! ");

                break;
            }

            if(totalatemps > 5){

                System.out.println("Two many failed atempts, account is permanently blocked!");

                break;
            }

        }
    }
}
