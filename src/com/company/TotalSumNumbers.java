package com.company;

import java.util.Scanner;

public class TotalSumNumbers {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = Integer.parseInt(scr.nextLine());
        int b = Integer.parseInt(scr.nextLine());
        int subtraction = Math.abs(a - b);
        int sum = a + b;
        int multiplication = a * b;
        int division = Math.abs(a / b);
        int modulis = Math.abs(a % b);
        Character operator = scr.next().charAt(0);
        if (operator.equals('+')) {
            if ((sum % 2 == 0)) {
                System.out.printf("%d + %d = %d - even", a, b, sum);
            } else if ((sum % 2 == 1)) {
                System.out.printf("%d + %d = %d - odd", a, b, sum);
            }
        }else if(operator.equals('-')){
            if((subtraction % 2 == 0)){
                System.out.printf("%d - %d = %d - even", a, b, subtraction);
            }else if((subtraction % 2 == 1)){
                System.out.printf("%d - %d = %d - odd", a, b, subtraction);
            }
        }else if(operator.equals('*')){
            if((multiplication % 2 == 0)){
                System.out.printf("%d * %d = %d - even", a, b, multiplication);
            }else if((multiplication % 2 == 1)){
                System.out.printf("%d * %d = %d - odd", a, b, multiplication);
            }
        }else if(operator.equals('/')){
            if((a == 0) || (b == 0)){
                System.out.printf("Cannot divide %f by 0", a);
            }else {
                System.out.printf("%d / %d = %d", a, b, division);
            }

        }else if(operator.equals('%')){
            if((a == 0) || (b == 0)){
                System.out.printf("Cannot divide %f by 0", a);
            }
            System.out.printf("%d %% %d = %d", a, b,modulis);
        }
    }
}
