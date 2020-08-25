package com.company;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int kozunaci = Integer.parseInt(scr.nextLine());
        int packOfEggs = Integer.parseInt(scr.nextLine());
        int kgsCookies = Integer.parseInt(scr.nextLine());
        double totalKozunaci = kozunaci * 3.20;
        double totalEggs = packOfEggs * 4.35;
        double totalCookies = kgsCookies * 5.40;
        double totalEggPaint = packOfEggs * 12 * 0.15;
        double totalCosts = totalKozunaci + totalEggs + totalCookies + totalEggPaint;
        System.out.printf("%.2f", totalCosts);
    }
}
