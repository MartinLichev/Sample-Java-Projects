package com.company;

import java.awt.*;
import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double priceofonesqaremeter = 7.61;
        double discount = 0.18;
        System.out.print("Please enter total size of your house:");
        double totalsize = Double.parseDouble(scr.nextLine());
        double pricewithoutdiscount = totalsize * priceofonesqaremeter;
        double pricewithdiscount = discount * pricewithoutdiscount;
        double finalprice = pricewithoutdiscount - pricewithdiscount;
        System.out.printf("The total end price is %.2f and the discount is %.2f",finalprice,pricewithdiscount);
    }
}
