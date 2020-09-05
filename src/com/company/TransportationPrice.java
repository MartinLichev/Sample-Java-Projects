package com.company;

import java.util.Scanner;

public class TransportationPrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int distanceInKM = Integer.parseInt(scanner.nextLine());

        String timeOfDay = scanner.nextLine();

        double totalPricePublicTransport = 0;

        double totalPriceTaxi = 0;

        double cheapestPrice = 0;

        if (distanceInKM <= 20) {

            if (timeOfDay.toLowerCase().equals("day")) {

                totalPricePublicTransport = distanceInKM * 0.09;

                totalPriceTaxi = (distanceInKM * 0.79) + 0.70;

            }
            if (timeOfDay.toLowerCase().equals("night")) {

                totalPricePublicTransport = distanceInKM * 0.09;

                totalPriceTaxi = (distanceInKM * 0.90) + 0.70;

            }


        }
        if (distanceInKM >= 20 && distanceInKM <= 100) {

            if (timeOfDay.toLowerCase().equals("day")) {

                totalPricePublicTransport = distanceInKM * 0.06;

                totalPriceTaxi = (distanceInKM * 0.79) + 0.70;

            }
            if (timeOfDay.toLowerCase().equals("night")) {

                totalPricePublicTransport = distanceInKM * 0.06;

                totalPriceTaxi = (distanceInKM * 0.79) + 0.70;

            }

        }

        if (totalPricePublicTransport > totalPriceTaxi) {

            cheapestPrice = totalPriceTaxi;

            System.out.println(cheapestPrice);

        } else {

            cheapestPrice = totalPricePublicTransport;

            System.out.println(cheapestPrice);
        }
    }
}
