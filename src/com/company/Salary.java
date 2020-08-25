package com.company;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numberOfOpenTabs = Integer.parseInt(scr.nextLine());
        int salary = Integer.parseInt(scr.nextLine());

        for(int a = 1; a <= numberOfOpenTabs; a++){

            String siteName = scr.nextLine();

            switch (siteName){
                case "Facebook":

                    salary = salary - 150;

                    break;

                case "Instagram":

                    salary = salary - 100;

                    break;

                case "Reddit":

                   salary = salary - 50;

                    break;

                    default:
                        break;

            }

            if(salary <= 0){

                System.out.println("You have lost your salary!");
                break;
            }

        }

        if(salary > 0) {

            System.out.printf("%d", salary);

        }

    }
}
