package com.company;

import java.util.Scanner;

public class Harvest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sizeVineyard = Integer.parseInt(scanner.nextLine());

        double grapeAmount = Double.parseDouble(scanner.nextLine());

        int neededWineAmount = Integer.parseInt(scanner.nextLine());

        int numberOfWorkers = Integer.parseInt(scanner.nextLine());

        double totalGrapeAmount = sizeVineyard * grapeAmount;

        double totalWineProductionAmount = ((totalGrapeAmount * 40) / 100) / 2.5;

        if (totalGrapeAmount < neededWineAmount) {

            System.out.printf("It will be a tough winter! More %f liters wine needed!", Math.floor(Math.abs(neededWineAmount - totalWineProductionAmount)));


        } else if (totalGrapeAmount > neededWineAmount) {

            System.out.printf("Good harvest this year! Total wine: %.0f liters!", Math.floor(totalWineProductionAmount));
            System.out.println();
            System.out.printf("%.0f liters left!", Math.floor(Math.abs(neededWineAmount - totalWineProductionAmount)));
            System.out.printf("%.0f liters per person", Math.floor(Math.abs(neededWineAmount - totalWineProductionAmount)/ numberOfWorkers));
        }

    }

}
