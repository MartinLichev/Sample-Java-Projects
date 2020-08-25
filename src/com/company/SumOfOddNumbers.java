package com.company;

import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfDigits = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= numberOfDigits; i++) {

            if (i % 2 == 0) {

                System.out.println(i);

            }
        }
    }
}
