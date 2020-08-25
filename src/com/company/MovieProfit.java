package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class MovieProfit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        int numberOfShootingDays = Integer.parseInt(scanner.nextLine());

        int numberOfTickets = Integer.parseInt(scanner.nextLine());

        double ticketPrice = Double.parseDouble(scanner.nextLine());

        int cinemaPercentage = Integer.parseInt(scanner.nextLine());

        double totalPriceTickets = ticketPrice * numberOfTickets;

    }
}
