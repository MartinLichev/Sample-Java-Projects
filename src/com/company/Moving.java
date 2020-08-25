package com.company;

import java.util.Scanner;

public class Moving {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        boolean noFreeSpace = false;

        int freeSpaceWidth = Integer.parseInt(scr.nextLine());

        int freeSpaceLength = Integer.parseInt(scr.nextLine());

        int freeSpaceHeigth = Integer.parseInt(scr.nextLine());

        int totalVolume = freeSpaceWidth * freeSpaceHeigth * freeSpaceLength;

        String input = scr.nextLine();

        int totalPacks = 0;

        while (!input.equals("Done")) {

            int numberOfPacks = Integer.parseInt(input);

            totalPacks = totalPacks + numberOfPacks;

            if(totalPacks > totalVolume){

                noFreeSpace = true;

                break;
            }

            input = scr.nextLine();

            if(noFreeSpace == true){

                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalVolume - totalPacks));

            }else{

                System.out.printf("%d Cubic meters left.", Math.abs(totalVolume - totalPacks));
            }

        }

    }
}
