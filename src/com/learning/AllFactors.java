package com.learning;


/**
 * Write a method that returns all the factors of a number (method parameter).
 * If number is less than 1, method must display an error message.
 */

public class AllFactors {

    public static void main(String[] args) {
        printFactors(99);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int factor = 1;
        while (factor <= number) {
            if (number % factor == 0) {
                System.out.println(factor);
            }
            factor++;
        }
    }
}
