package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tiffany Thani
 */

import java.util.Scanner;

public class Exercise26 {

    public static int calculateMonthsUntilPaidOff(double b, double i, double p) {

        i = i / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + b / p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i));

    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double b, i, p;

        System.out.print("What is your balance? ");
        b = scanner.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        i = scanner.nextDouble();
        i = i / 100;

        System.out.print("What is the monthly payment you can make? ");
        p = scanner.nextDouble();

        int months = calculateMonthsUntilPaidOff(b, i, p);
        System.out.println("It will take " + months + " months to pay off this card.");
    }
}