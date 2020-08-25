package com.company;

import java.util.Scanner;

public class MakingProjects {
    public static void main(String[] args) {
        int project = 3;
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter number of objects:");
        int NumberOfObjects = Integer.parseInt(scr.nextLine());
        int FinalResult = NumberOfObjects * project;
        System.out.println(FinalResult);
    }
}
