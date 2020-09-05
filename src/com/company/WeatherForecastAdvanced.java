package com.company;

import java.util.Scanner;

public class WeatherForecastAdvanced {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        if (input >= 5.00 && input <= 11.9) {

            System.out.println("Cold!");

        }
        if (input >= 12.00 && input <= 14.9) {

            System.out.println("Cool!");

        }
        if (input >= 15.00 && input <= 20.00) {

            System.out.println("Mild!");

        }
        if (input >= 20.1 && input <= 25.9) {

            System.out.println("Warm!");

        }
        if (input >= 26.00 && input <= 35.00) {

            System.out.println("Hot!");

        } else {

            System.out.println("Incorrect Input!");
        }

    }
}
