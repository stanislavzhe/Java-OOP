package com.stas.JavsStart.home3_4.Homework2starsConditionsLoops;

import java.util.Scanner;

/**
 * Created by stanislavz on 13-Mar-17.
 */
public class Task1DigitsPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = scanner.nextInt();

        outputDigits(n);
    }

    public static void outputDigits(int n) {

        if (n < 0) {
            System.out.print("- ");
        }
        boolean firstElement = false;

        for (int i = 1000000000; i >= 1; i = i / 10) {
            if ((Math.abs((n / i)) % 10 != 0) && (firstElement == false)) {
                firstElement = true;
            }
            if ((Math.abs((n / i)) % 10 == 0) && (firstElement == false)) {
                System.out.print("");
            } else {
                System.out.print(Math.abs((n / i)) % 10 + " ");
            }
        }
    }
}
