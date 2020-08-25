package com.company;

import java.util.Scanner;

public class WhileLoopsEx {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();

        while(!input.equals("Stop")){
            input = scr.next();
        }
    }
}
