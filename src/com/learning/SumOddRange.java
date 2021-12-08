package com.learning;

/**
 * Write a method that will return a sum of all odd numbers within a given number interval.
 */

public class SumOddRange {

    // Method to check if a number is odd

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else {
            return number % 2 != 0;
        }
    }

    // Method to add all odd numbers within a range

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end < start || end < 0 || start < 0) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
