package com.company;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double hallrent = Double.parseDouble(scr.nextLine());
        double birthdaycakeprice = (hallrent * 20) /100;
        double drinksprice = birthdaycakeprice - birthdaycakeprice * 0.45;
        double animatorprice = hallrent / 3;
        double totalprice = hallrent + birthdaycakeprice + drinksprice + animatorprice;
        System.out.println(totalprice);
    }
}
