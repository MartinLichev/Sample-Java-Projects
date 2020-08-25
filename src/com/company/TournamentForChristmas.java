package com.company;

import java.util.Scanner;

public class TournamentForChristmas {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int tournamentDays = Integer.parseInt(scr.nextLine());


        for(int a = 1; a <= tournamentDays; a++){

            double wonMoney = 0;

            int countDailyWinGames = 0;

            int countDailyLostGames = 0;


            String typeGame = scr.nextLine();

            while(!typeGame.equals("Finish")){

                String gameResult = scr.nextLine();

                if(gameResult.equals("Win")){

                    wonMoney = wonMoney + 20;
                    countDailyWinGames ++;

                }else{

                    countDailyLostGames ++;
                }


                typeGame = scr.nextLine();

                if(countDailyWinGames > countDailyLostGames){

                }

            }


        }

    }
}
