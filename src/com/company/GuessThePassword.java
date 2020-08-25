package com.company;

import java.util.Scanner;
import java.lang.String;

public class GuessThePassword {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String secretpassword = "s3cr3t!P@ssw0rd";
        String input = scr.nextLine();
        if(input.equals(secretpassword)){
            System.out.println("Password is correct!");
        }else{
            System.out.println("Wrong Password!");
        }
        
    }
}
