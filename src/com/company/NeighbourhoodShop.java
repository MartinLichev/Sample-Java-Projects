package com.company;

import java.util.Scanner;

public class NeighbourhoodShop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String product = scr.nextLine();
        String town = scr.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scr.nextLine());
        double sum = 0;
        if (town.equals("sofia")) {
            if (product.equals("coffee")) {
                sum = quantity * 0.50;

            }
            else if(product.equals("water")) {
                sum = quantity * 0.80;

            }
            else if(product.equals("beer")) {
                sum = quantity * 1.20;

            }
            else if(product.equals("sweets")) {
                sum = quantity * 1.45;

            }
            else if(product.equals("peanuts")) {
                sum = quantity * 1.60;

            }

        } else if (town.equals("plovdiv")) {
            if (product.equals("coffee")) {
                sum = quantity * 0.40;

            }
            else if(product.equals("water")) {
                sum = quantity * 0.70;

            }
            else if(product.equals("beer")) {
                sum = quantity * 1.15;

            }
            else if(product.equals("sweets")) {
                sum = quantity * 1.30;

            }
            else if(product.equals("peanuts")) {
                sum = quantity * 1.50;

            }
        } else if (town.equals("varna")) {
            if (product.equals("coffee")) {
                sum = quantity * 0.45;

            }
            else if(product.equals("water")) {
                sum = quantity * 0.70;

            }
            else if(product.equals("beer")) {
                sum = quantity * 1.10;

            }
            else if(product.equals("sweets")) {
                sum = quantity * 1.35;

            }
            else if(product.equals("peanuts")) {
                sum = quantity * 1.55;

            }
        }
        System.out.println(sum);
    }
}

