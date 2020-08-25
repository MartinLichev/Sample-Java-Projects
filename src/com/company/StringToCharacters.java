package com.company;

import java.util.Scanner;

public class StringToCharacters {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();
        for(int a = 0; a < input.length(); a++){
            System.out.println(input.charAt(a));
        }
    }
}
