package com.company;

import java.util.Locale;
import java.util.Scanner;

public class PrintCountryAndLanguage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameInput = scanner.nextLine();

        switch(nameInput.toUpperCase(Locale.US)){

            case "BULGARIA":

                System.out.println("bulgarian");

                break;

            case "ROMANIA":

                System.out.println("romanian");

                break;

            case "PORTUGAL":

                System.out.println("portugeese");

                break;

            case "AUSTRIA":

                System.out.println("german");

                break;

            default:

                System.out.println("invalid entry");

                break;
        }

    }
}
