package com.company;

import java.util.Scanner;

public class MrOrMrs2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int age = Integer.parseInt(scr.nextLine());
        String name = scr.nextLine();
        if (age >= 16) {
            if (name.equals("m")) {
                System.out.println("Mr");
            } else if(name.equals("f")){
                System.out.println("Ms");
            }
        }else if(age < 16){
            if(name.equals("m")){
                System.out.println("Master");
            }else if(name.equals("f")){
                System.out.println("Miss");
            }
        }
    }
}
