package com.stas.JavsStart.home3_4.Homework2starsConditionsLoops;

import java.util.Scanner;

/**
 * Created by stanislavz on 13-Mar-17.
 */
public class Task2RadixPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = scanner.nextInt();

        if (n < 0) {
            throw new IllegalArgumentException("Value should be more then 0, now it = " + n);
        }

        System.out.print("Enter radix: ");
        int radix = scanner.nextInt();


        if (radix < 2 || radix > 10) {
            throw new IllegalArgumentException("Radix should be in range (2..10), now it = " + radix);
        }


        printInRadix(n, radix);

    }

    public static void printInRadix(int n, int radix) {
        String nRadix = Integer.toUnsignedString(n, radix);
        System.out.println(nRadix);

    }
}