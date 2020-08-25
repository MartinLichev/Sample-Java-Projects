package com.company;

import java.util.Scanner;

public class MilesConverter {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double number = Double.parseDouble(scr.nextLine());
        String metricToConvert = scr.nextLine();
        String outputMetric = scr.nextLine();
        if(metricToConvert.equals("mm")){
            number = number / 1000;
        }else if(metricToConvert.equals("cm")){
            number = number / 100;
        }

        if(outputMetric.equals("mm")){
            number = number * 1000;
        }else if(outputMetric.equals("cm")){
            number = number * 100;
        }

        System.out.printf("%.3f",number);
    }
}
