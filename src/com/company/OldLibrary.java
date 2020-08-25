package com.company;

import java.util.Scanner;

public class OldLibrary {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        String bookName = scr.nextLine();

        int bookCount = 0;

        boolean bookIsFound = false;

        String input = scr.nextLine();

        while(!input.equals("No more books")){

            if(input.equals(bookName)){
                bookIsFound = true;
                break;

            }

            input = scr.nextLine();
            bookCount ++;

        }

        if(bookIsFound){

            System.out.printf("You checked %d books and found it", bookCount);


        }else{

            System.out.printf("The book you search is not here.%n");
            System.out.printf("You checked %d books", bookCount);

        }
    }
}
