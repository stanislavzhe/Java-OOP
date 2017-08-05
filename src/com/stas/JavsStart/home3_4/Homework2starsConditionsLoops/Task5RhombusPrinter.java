package com.stas.JavsStart.home3_4.Homework2starsConditionsLoops;

import java.util.Scanner;

/**
 * Created by stanislavz on 14-Mar-17.
 */
public class Task5RhombusPrinter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        if (size < 0 || (size % 2 == 0)) {
            throw new IllegalArgumentException("Size odd or less then 0, size = " + size);
        }
        nRowPrinter(size);
    }

    public static void rowPrinter(int size, int rowNumber) {
        String symbol;
        //for first and last rows
        if (rowNumber == 1 || rowNumber == size) {
            for (int i = 1; i <= size; i++) {

                if (i == size / 2 + 1) {
                    symbol = "*";
                    System.out.print(symbol);

                } else {
                    symbol = " ";
                    System.out.print(symbol);
                }
            }
        }
        //first half
        if (rowNumber > 1 && rowNumber <= size / 2 + 1) {
            for (int i = 1; i <= size; i++) {

                if (i == size / 2 + 1 - rowNumber + 1 || i == size / 2 + 1 + rowNumber - 1) {
                    symbol = "*";
                    System.out.print(symbol);

                } else {
                    symbol = " ";
                    System.out.print(symbol);
                }
            }
        }
        //last half
        if (rowNumber > size / 2 + 1 && rowNumber < size) {
            rowNumber = size - rowNumber + 1;
            for (int i = 1; i <= size; i++) {

                if (i == size / 2 + 1 - rowNumber + 1 || i == size / 2 + 1 + rowNumber - 1) {
                    symbol = "*";
                    System.out.print(symbol);

                } else {
                    symbol = " ";
                    System.out.print(symbol);
                }
            }
        }
        System.out.println();

    }

    public static void nRowPrinter(int size) {
        for (int rowNumber = 1; rowNumber <= size; rowNumber++) {
            rowPrinter(size, rowNumber);
        }
    }
}
