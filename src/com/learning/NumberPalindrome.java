package com.learning;

/**
 * Write a method that will return a boolean and indicate if a number is a palindrome.
 */

public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(1221)); // true
        System.out.println(isPalindrome(31221)); // false
        System.out.println(isPalindrome(912219)); // true
        System.out.println(isPalindrome(11)); // true

    }

    public static boolean isPalindrome(int number) {

        number = Math.abs(number);
        int originalNumber = number;
        int reversedNumber = 0;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            number /= 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
        }
        return originalNumber == reversedNumber;
    }
}
