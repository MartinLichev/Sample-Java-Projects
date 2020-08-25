package com.company;

import java.util.Scanner;

public class HoneyHarvest {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        String flowersType = scr.nextLine();

        int numberOfFlowers = Integer.parseInt(scr.nextLine());

        int sunflower = 0;

        int daisy = 0;

        int lavender = 0;

        int mint = 0;

        double totalHoney = 0;

        double totalHoneyGathered = 0;

        String season = scr.nextLine();

        if(season.equals("Spring")){

            sunflower = 10;
            daisy = 12;
            lavender = 12;
            mint = 10;

            if(flowersType.equals("Sunflower")){

                totalHoney = numberOfFlowers * sunflower;


            }if(flowersType.equals("Daisy")){

                totalHoney = numberOfFlowers * daisy;

                totalHoneyGathered = totalHoney * 1.10;


            }if(flowersType.equals("Lavender")){

                totalHoney = numberOfFlowers * lavender;


            }if(flowersType.equals("Mint")){

                mint *= 1.10;

                totalHoney = numberOfFlowers * mint;

            }


        }if(season.equals("Autumn")){

            sunflower = 12;
            daisy = 6;
            lavender = 6;
            mint = 6;

            if(flowersType.equals("Sunflower")){

                totalHoney = numberOfFlowers * sunflower;

                totalHoneyGathered = totalHoney * 0.95;

            }if(flowersType.equals("Daisy")){

                totalHoney = numberOfFlowers * daisy;

                totalHoneyGathered = totalHoney * 0.95;

            }if(flowersType.equals("Lavender")){

                totalHoney = numberOfFlowers * lavender;

                totalHoney = totalHoney * 0.95;

            }if(flowersType.equals("Mint")){

                totalHoney = numberOfFlowers * mint;

                totalHoney = totalHoney * 0.95;

            }

        }if(season.equals("Summer")){

            sunflower = 8;
            daisy = 8;
            lavender = 8;
            mint = 12;

            if(flowersType.equals("Sunflower")){

                totalHoney = numberOfFlowers * sunflower;

                totalHoney = totalHoney * 1.10;

            }if(flowersType.equals("Daisy")){

                totalHoney = numberOfFlowers * daisy;

                totalHoney = totalHoney  * 1.10;

            }if(flowersType.equals("Lavender")){

                totalHoney = numberOfFlowers * lavender;

                totalHoney = totalHoney * 1.10;

            }if(flowersType.equals("Mint")){

                totalHoney = numberOfFlowers * mint;

                totalHoney = totalHoney * 1.10;


            }

        }

        System.out.printf("Total honey harvested: %.2f", totalHoneyGathered);

    }
}
