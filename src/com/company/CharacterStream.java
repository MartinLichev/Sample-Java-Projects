package com.company;

import java.util.Scanner;

public class CharacterStream {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();
        Character finalinput = null;
        for(int a = 0; a < input.length(); a++){
           finalinput = input.charAt(a);
            System.out.println(finalinput);
        }
    }
}
