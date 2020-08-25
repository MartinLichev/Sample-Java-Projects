package com.company;

import java.io.IOException;
import java.util.Scanner;

public class MrOrMrs {
    public static void main(String[] args)throws IOException {
        Scanner scr = new Scanner(System.in);
        double age = Double.parseDouble(scr.nextLine());
        String title = scr.nextLine();
        if((age >= 16) && (title.equals("m"))){
            System.out.println("Mr.");
        }else if((age < 16) && (title.equals("m"))){
            System.out.println("Master");
        }else if((age >= 16) && (title.equals("f"))){
            System.out.println("Missis");
        }else if((age < 16) && (title.equals("f"))){
            System.out.println("Miss");
        }else{
            System.out.println("Error!Please, try again!");
        }
    }
}
