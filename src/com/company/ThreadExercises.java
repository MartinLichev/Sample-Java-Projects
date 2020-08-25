package com.company;

public class ThreadExercises extends Thread {

    ThreadExercises thread = new ThreadExercises();

    public void PrintNumbers() {

        for (int i = 0; i <= 10; i++) {

            System.out.println(i);

        }
    }

}

class MyProgram {



    public static void main(String[] args) {

        for (int a = 0; a <= 20 ; a++) {

            System.out.println(a);



        }



    }
}
