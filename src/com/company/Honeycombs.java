package com.company;

import java.util.Scanner;

public class Honeycombs {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int numberOfBees = Integer.parseInt(scr.nextLine());

        int numberOfFlowers = Integer.parseInt(scr.nextLine());

        double honeyFromOneBee = 0.21;

        double totalHoney = numberOfBees * numberOfFlowers * honeyFromOneBee;

        double honeycombsProduced = Math.floor(totalHoney / 100);

        double honeyLeft = totalHoney - (honeycombsProduced * 100);

        System.out.printf("%.0f honeycombs filled.", honeycombsProduced);

        System.out.println();

        System.out.printf("%.2f grams of honey left.", honeyLeft);

    }
}

