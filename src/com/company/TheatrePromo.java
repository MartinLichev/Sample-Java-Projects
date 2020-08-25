package com.company;

import java.util.Scanner;

public class TheatrePromo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        String dayType = scanner.nextLine();

        int price = 0;

        if (dayType.equals("Weekday")) {

            if ((age >= 0) && (age <= 18)) {


                price = 12;

            } else if ((age > 18) && (age <= 64)) {


                price = 18;

            } else if ((age > 64) && (age <= 122)) {

                price = 12;

            }

        } else if (dayType.equals("Weekend")) {

            if ((age >= 0) && (age <= 18)) {

                price = 15;

            } else if ((age > 18) && (age <= 64)) {

                price = 20;

            } else if ((age > 64) && (age <= 122)) {

                price = 15;

            }

        } else if (dayType.equals("Holiday")) {

            if ((age >= 0) && (age <= 18)) {

                price = 5;

            } else if ((age > 18) && (age <= 64)) {

                price = 12;

            } else if ((age > 64) && (age <= 122)) {

                price = 10;

            }
        }

        if (price != 0) {

            System.out.printf("The price is %d", price);

        } else {

            System.out.println("Error");
        }
    }
}
