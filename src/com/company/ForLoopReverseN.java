package com.company;

import java.util.Scanner;

public class ForLoopReverseN {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = Integer.parseInt(scr.nextLine());

        for(int a = n; a > 0; a--){
            System.out.println(a);
        }
    }
}
