package com.company;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double income = Double.parseDouble(scr.nextLine());
        double grade = Double.parseDouble(scr.nextLine());
        double minimalWageSalary = Double.parseDouble(scr.nextLine());
        double socialScholarship = 0;
        double excelentGradesScholarship = 0;
        if((income < minimalWageSalary) && (grade > 4.5)){
            socialScholarship = minimalWageSalary * 0.35;
            System.out.printf("You get a Social scholarship %.0fBGN",Math.floor(socialScholarship));
        }else if(grade >= 5.5){
            excelentGradesScholarship = grade * 25;
            System.out.printf("You get a scholarship for excellent results %.0fBGN",Math.floor(excelentGradesScholarship));
        }else{
            System.out.println("You cannot get a scholarship!");
        }
    }
}
