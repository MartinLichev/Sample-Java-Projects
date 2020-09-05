package com.company;

import java.util.Scanner;

public class VeggieMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceVeggiesKGs = Double.parseDouble(scanner.nextLine());

        double priceFruitsKGs = Double.parseDouble(scanner.nextLine());

        int totalKGsVeggies = Integer.parseInt(scanner.nextLine());

        int totalKGsFruits = Integer.parseInt(scanner.nextLine());

        double totalPriceForVeggies = priceVeggiesKGs * totalKGsVeggies;

        double totalPriceForFruits = priceFruitsKGs * totalKGsFruits;

        double totalPriceFruitsAndVeggies = totalPriceForVeggies + totalPriceForFruits;

        double totalPriceFruitsAndVeggiesInEuro = totalPriceFruitsAndVeggies / 1.94;

        System.out.printf("Total Price in Euro: %.2f",totalPriceFruitsAndVeggiesInEuro);


    }


}
