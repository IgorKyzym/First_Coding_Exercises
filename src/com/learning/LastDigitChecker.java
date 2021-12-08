package com.learning;

public class LastDigitChecker {

    // check if at least 2 parameters have the same last digit

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {

        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }
        int l1 = n1 % 10;
        int l2 = n2 % 10;
        int l3 = n3 % 10;

        return (l1 == l2 || l1 == l3 || l2 == l3);
    }

    // valid range of parameters is from 10 to 1000 (both inclusive)

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}
