package com.learning;

/**
 * Write a method that will print out number as words for the digits.
 * Hint: number must be reversed and watch out for the zero(s) in the end of a number.
 */

public class NumberToWords {

    public static void main(String[] args) {
//        System.out.println(getDigitCount(1000));
//        System.out.println(getDigitCount(100));
//        System.out.println(reverse(34521));
//        System.out.println(reverse(92380));
//        System.out.println(reverse(-2));
        numberToWords(1255346600);
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        } else {

            int reversedNumber = reverse(number);
            int storedReversedNumber = reversedNumber;

            int lastDigit = 0;
            while (reversedNumber != 0) {
                lastDigit = reversedNumber % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber /= 10;
            }
            if (getDigitCount(number) != getDigitCount(storedReversedNumber)) {
                int zeroTimes = getDigitCount(number) - getDigitCount(storedReversedNumber);
                for (int i = 1; i <= zeroTimes; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number) {
        int lastDigit = 0;
        int reversedNumber = 0;
        while (number != 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int digitCount = 0;
        if (number < 10) {
            return 1;
        } else {
            while (number != 0) {
                number = number / 10;
                digitCount++;
            }
            return digitCount;
        }
    }
}
