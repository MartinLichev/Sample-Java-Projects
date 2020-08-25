package com.company;

import java.util.Scanner;

public class WhileLoopExercises {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String input = null;

        while(!input.equals("Stop")){

            input = scr.nextLine();

            System.out.println(input);
        }
    }
}
