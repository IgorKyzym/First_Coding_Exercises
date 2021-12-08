package com.learning;

/**
 * Write a method that return greatest common divisor of the two numbers (2 input parameters)
 * If any of the two parameters is less than 10, method must return -1.
 */

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        int divisor = getMin(first, second);
        if (!isValid(first) || !isValid(second)) {
            return -1;
        }
        while (true) {
            if (first % divisor == 0 && second % divisor == 0) {
                break;
            }
            divisor--;
        }
        return divisor;
    }

    public static boolean isValid(int number) {
        return number >= 10;
    }

    public static int getMin(int n1, int n2) {
        int min = n1;
        if (n2 < n1) {
            min = n2;
        }
        return min;
    }
}
