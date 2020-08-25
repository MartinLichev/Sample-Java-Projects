package com.company;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int guests = Integer.parseInt(scr.nextLine());
        double envelopeForOnePerson = Double.parseDouble(scr.nextLine());
        double budget = Double.parseDouble(scr.nextLine());
        double totalEnvelope = 0;
        double priceCake = (budget * 10) / 100;
        if((guests >= 10) && (guests <= 15)){
            envelopeForOnePerson =  envelopeForOnePerson - (envelopeForOnePerson * 15) / 100;

        }else if((guests > 15) && (guests <= 20)){
            envelopeForOnePerson = envelopeForOnePerson - (envelopeForOnePerson * 20) / 100;

        }else{
            envelopeForOnePerson = envelopeForOnePerson - (envelopeForOnePerson *  25) / 100;
        }

        totalEnvelope = envelopeForOnePerson * guests;
        double totalCosts = totalEnvelope + priceCake;

        if(totalCosts <= budget){
            System.out.printf("It's part time! %.2f leva left.", Math.abs(totalCosts - budget));
        }else if(totalCosts > budget){
            System.out.printf("No party! %.2f leva needed.", Math.abs(totalCosts - budget));
        }

    }
}
