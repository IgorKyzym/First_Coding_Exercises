package com.learning;

/**
 * Write a method that returns a sum of all the even digits in a number.
 * If number is negative, method must return -1.
 */

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(50));
    }

    public static int getEvenDigitSum(int number){

        int sumEven = 0;
        int digit = 0;
        if (number < 0){
            return -1;
        }
        while (number != 0){
            digit = number % 10;
            if (digit % 2 == 0){
                sumEven += digit;
            }
            number = number /10;
        }
        return sumEven;
    }
}
