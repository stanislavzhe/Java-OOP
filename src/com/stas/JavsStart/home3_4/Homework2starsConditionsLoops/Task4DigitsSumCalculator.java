package com.stas.JavsStart.home3_4.Homework2starsConditionsLoops;

import java.util.Scanner;

/**
 * Created by stanislavz on 13-Mar-17.
 */
public class Task4DigitsSumCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter from: ");
        int from = scanner.nextInt();

        System.out.print("Enter to: ");
        int to = scanner.nextInt();

        if (from > to) {
            throw new IllegalArgumentException("From should be more than to; from = " + from + "; to = " + to);
        }

        int sum = printDigitSums(from, to);
        System.out.println(sum);


    }

    public static int printDigitSums(int from, int to) {

        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum = sum + digitSum(i);
        }
        return sum;
    }

    public static int digitSum(int number) {
        int sum = 0;
        for (int i = 1000000000; i >= 1; i = i / 10) {

            sum = sum + Math.abs((number / i)) % 10;
        }
        return sum;
    }

}

