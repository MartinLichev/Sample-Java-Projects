package com.company;

import java.util.Scanner;

public class SummerWear {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int grad = Integer.parseInt(scr.nextLine());
        String timeOfDay = scr.nextLine().toLowerCase();
        String outfit ="";
        String shoes = "";
        if((grad >= 10) && (grad <= 18)){
             if(timeOfDay.equals("morning")){
                 outfit = "Sweatshirt";
                 shoes = "Sneakers";
                System.out.printf("It's %d degrees, get your %s and %s.",grad,outfit,shoes);
            }else if(timeOfDay.equals("afternoon")){
                 outfit = "Shirt";
                 shoes = "Moccasins";
                 System.out.printf("It's %d degrees, get your %s and %s.",grad,outfit,shoes);
             }else if(timeOfDay.equals("evening")){
                 outfit = "Shirt";
                 shoes = "Moccasins";
                 System.out.printf("It's %d degrees, get your %s and %s.",grad,outfit,shoes);
             }

        }else if((grad > 18) && (grad <= 24)){

            if(timeOfDay.equals("morning")){
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.",grad,outfit,shoes);
            }else if(timeOfDay.equals("afternoon")){
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.",grad,outfit,shoes);
            }else if(timeOfDay.equals("evening")){
                outfit = "Shirt";
                shoes = "Mocassins";
                System.out.printf("It's %d degrees, get your %s and %s.",grad,outfit,shoes);
            }

        }else if((grad >= 25)){

            if(timeOfDay.equals("morning")){
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.",grad,outfit,shoes);
            }else if(timeOfDay.equals("afternoon")){
                outfit = "Swim Suit";
                shoes = "Barefoot";
                System.out.printf("It's %d degrees, get your %s and %s.",grad,outfit,shoes);
            }else if(timeOfDay.equals("evening")){
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.",grad,outfit,shoes);
            }

        }
    }
}


