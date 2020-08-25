package com.company;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String lengthOfContract = scr.nextLine();
        String contactType = scr.nextLine();
        String addedMobileData = scr.nextLine();
        int numberofMonthsForPaying = Integer.parseInt(scr.nextLine());
        double monthlyfee = 0;
        double finalfee = 0;

        if (lengthOfContract.contains("one")) {
            switch (contactType) {
                case "Small":
                    monthlyfee = 9.98;
                    break;
                case "Middle":
                    monthlyfee = 18.99;
                    break;
                case "Large":
                    monthlyfee = 25.98;
                    break;
                case "ExtraLarge":
                    monthlyfee = 35.99;
                    break;
                default:
                    System.out.println("Error!Please try again!");
            }

        } else if (lengthOfContract.contains("two")) {
            switch (contactType) {
                case "Small":
                    monthlyfee = 8.58;
                    finalfee = monthlyfee * numberofMonthsForPaying;
                    finalfee = (finalfee - 3.75) / 100;

                    break;
                case "Middle":
                    monthlyfee = 17.09;
                    finalfee = monthlyfee * numberofMonthsForPaying;
                    finalfee = (finalfee - 3.75) / 100;

                    break;
                case "Large":
                    monthlyfee = 23.59;
                    finalfee = monthlyfee * numberofMonthsForPaying;
                    finalfee = (finalfee - 3.75) / 100;


                    break;
                case "ExtraLarge":
                    monthlyfee = 31.79;
                    finalfee = monthlyfee * numberofMonthsForPaying;
                    finalfee = finalfee - (finalfee * 3.75) / 100;

                    break;
                default:
                    System.out.println("Error!Please try again!");
                    break;
            }
        } else {
            System.out.println("Error! Please try again!");

        }

        if(addedMobileData.equals("yes")){
            if(monthlyfee <= 10) {
                finalfee = monthlyfee + 5.50;
                finalfee = finalfee * numberofMonthsForPaying;
            }else if(monthlyfee <= 30){
                finalfee += 4.35;
            }else if(monthlyfee > 30){
                finalfee += 3.85;

            }

        }else if(addedMobileData.equals("no")){

        }else{
            System.out.println("Error!Please try again!");
        }

        System.out.printf("%.2f lv", finalfee);
    }
}


