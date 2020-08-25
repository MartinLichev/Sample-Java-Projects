package com.company;

import java.util.Scanner;

    public class Schools{
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            double dohod = Double.parseDouble(scan.nextLine());
            double avgScore = Double.parseDouble(scan.nextLine());
            double minSalary = Double.parseDouble(scan.nextLine());

            if ((dohod < minSalary) && (avgScore > 4.5)){
                System.out.printf("You get a Social scholarship %.0f BGN", minSalary * 0.35);
            }else {
                System.out.println("You cannot get a scholarship!");

                if (avgScore>=5.5) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", avgScore * 0.25);


                }

            }

        }
    }

