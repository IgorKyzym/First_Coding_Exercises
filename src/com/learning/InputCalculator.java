package com.learning;

/**
 * Write a method that can continuously read user input (integers). If anything else than an integer has been
 * entered by a user, method must should display the sum and an average of all the integers inputted prior.
 */

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true) {

            System.out.println("Enter a number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                counter++;
                sum += number;
                avg = Math.round((double) (sum / counter));

            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}
