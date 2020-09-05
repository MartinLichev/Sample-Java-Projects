package com.company;

import java.util.Scanner;

public class WeatherForecastProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input.toLowerCase()) {
            case "sunny":

                System.out.println("It's warm outside!");

                break;

            case "cold":

                System.out.println("It's cold outside!");

                break;

            case "snow":

                System.out.println("It's snowy outside!");

                break;

            default:

                System.out.println("Incorrect input!");

                break;
        }
    }
}
