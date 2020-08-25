package com.company;

import java.util.Scanner;

public class BeehiveRole {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int beeInteligence = Integer.parseInt(scr.nextLine());

        int beeStrength = Integer.parseInt(scr.nextLine());

        String gender = scr.nextLine();

        String beeType = " ";

        switch (gender){

            case "male":

                if( beeStrength >= 80){

                    beeType += "Drone Bee";

                }
                break;

            case "female":

                if(( beeInteligence >= 80) && ( beeStrength >= 80)){

                    beeType += "Queen Bee";

                }
                break;

            case "any":

                if( beeInteligence >= 80){

                    beeType += "Repairing Bee";

                }else if(( beeInteligence >= 60) && ( beeInteligence < 80)){

                    beeType += "Cleaning Bee";

                }else if( beeStrength >= 60){

                    beeType += "Guard Bee";

                }else{

                    beeType += "Worker Bee";
                }
                break;

        }

        System.out.println(beeType);

    }
}
