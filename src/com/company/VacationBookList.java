package com.company;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int pages = Integer.parseInt(scr.nextLine());
        int pagesperhour = Integer.parseInt(scr.nextLine());
        int days = Integer.parseInt(scr.nextLine());
        int hoursneededtoreadbook = pages / pagesperhour;
        int totalhoursneeded = hoursneededtoreadbook / days;
        System.out.printf("The number of hours needed to read the book are:%d", totalhoursneeded);
    }
}
