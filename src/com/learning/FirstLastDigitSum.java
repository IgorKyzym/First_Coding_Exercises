package com.learning;

/**
 * Write a method that returns a sum of the first and the last digit in a number (input parameter).
 * For negative numbers, method must return -1.
 *
 */
public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10)); // 1
        System.out.println(sumFirstAndLastDigit(8)); // 16
        System.out.println(sumFirstAndLastDigit(954659)); // 18
        System.out.println(sumFirstAndLastDigit(9)); // 18
    }

    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;
        int lastDigit = number % 10;
        int firstDigit = 0;

        if (number < 0) {
            return -1;
        }

        // a single digit number is counted as the first and also the last digit
        if (number < 10) {
            sum = lastDigit * 2;
        } else {
            while (number >= 10) {
                firstDigit = number / 10;
                number /= 10;
                sum = lastDigit + firstDigit;
            }
        }
        return sum;
    }
}
