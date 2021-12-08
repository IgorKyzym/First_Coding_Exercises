package com.learning;

/**
 * Write a method that returns the largest prime factor of a given number.
 */

public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {

        if (number < 2) {       // 0 and 1 can't be prime numbers
            return -1;
        }
        for (int i = 2; i < number; i++) {      // should not start with 1, because it will result in an endless loop
            if (number % i == 0) {
                number /= i;        // calculating new LargestPrime
                i--;        // to ensure that a new LargestPrime is checked if divisible by the same i (45 / 3 = 15,
                            // 15 / 3 = 5
            }
        }
        return number;
    }
}