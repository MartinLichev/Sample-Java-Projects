package com.company;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double lenghtaquarium = Double.parseDouble(scr.nextLine());
        double heightaquarium = Double.parseDouble(scr.nextLine());
        double widthaquarium = Double.parseDouble(scr.nextLine());
        double percentage = Double.parseDouble(scr.nextLine());
        double aquariumvolume = lenghtaquarium * heightaquarium * widthaquarium;
        double actualaquariumvolume = aquariumvolume * 0.001;
        double percenragecalculated = percentage * 0.01;
        double watertofillaqurium = actualaquariumvolume * (1 - percenragecalculated);
        System.out.printf("%.3f",watertofillaqurium);
    }
}
