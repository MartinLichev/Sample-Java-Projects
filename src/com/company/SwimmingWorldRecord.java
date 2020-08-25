package com.company;

import java.util.Scanner;

public class SwimmingWorldRecord {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double recordToBeat = Double.parseDouble(scr.nextLine());
        double distanceInMeters = Double.parseDouble(scr.nextLine());
        double oneMeterDistance = Double.parseDouble(scr.nextLine());
        double totalTime = distanceInMeters * oneMeterDistance;
        double totalDelay = (distanceInMeters / 15) * 12.5;
        double finalTime = totalTime + totalDelay;
        if(finalTime < recordToBeat){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",(Math.floor(finalTime)));
        }else if(finalTime > recordToBeat){
            System.out.printf("No, he failed! He was %.2f seconds slower.",(finalTime - recordToBeat));
        }
    }
}
