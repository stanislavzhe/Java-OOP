package com.stas.JavsStart.home3_4.Homework2starsConditionsLoops;

import java.util.Scanner;

/**
 * Created by stanislavz on 13-Mar-17.
 */
public class Task3PrimesPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter from: ");
        int from = scanner.nextInt();

        System.out.print("Enter to: ");
        int to = scanner.nextInt();

        if (from > to) {
            throw new IllegalArgumentException("From should be more than to; from = " + from + "; to = " + to);
        }

        printPrimes(from, to);

    }

    public static void printPrimes(int from, int to) {

        for (int i = from; i <= to; i++) {
            primeNumber(i);
        }
    }

    public static void primeNumber(int number) {
        int k = 0;

        for (int j = 2; j <= number; j++) {

            if (number % j == 0) {
                k = k + 1;
            }

            if (j == number && k == 1) {
                System.out.print(j + " ");
            }
        }
    }
}
