package com.learning;

/**
 * Write a method that will determine if a number is perfect or not.
 * <p>
 * What is the perfect number?
 * A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
 * Proper positive divisors are positive integers that fully divide the perfect number without leaving a
 * remainder and exclude the perfect number itself.
 * <p>
 * For example, take the number 6:
 * Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded),
 * and the sum of its proper divisors is 1 + 2 + 3 = 6.
 */

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int divisorSum = 0;
        int divisor = 1;
        while (divisor < number) {
            if (number % divisor == 0) {
                divisorSum += divisor;
            }
            divisor++;
        }
        return divisorSum == number;
    }
}
