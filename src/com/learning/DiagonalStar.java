package com.learning;

/**
 * Write a method that displays a square star pattern. Method must accept number of stars (*) as a parameter.
 * The pattern consists of a number of rows and columns (where input number of stars is a number to rows to print.
 * For each row or column, stars are printer on four conditions:
 * - in the first and last row;
 * - in the first or last column;
 * - when the row number equals the column number;
 * - when the column number equals (rowCount - current + 1).
 * If the number of stars (input parameter) is less than 5, method must display an error.
 */

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || j == 1 || j == number || i == number || i == j || (j == (number - i + 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");

                    }
                }
                System.out.println("");
            }
        }
    }
}