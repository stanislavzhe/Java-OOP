package com.stas.JavsStart.lesson5and6;

import java.util.Scanner;

import static com.stas.JavsStart.lesson5and6.RangeSumMethods.rangeSum;

/**
 * Created by PC-Dom on 11.03.2017.
 */
public class RangeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int first = scanner.nextInt();
        System.out.print("Enter last value: ");
        int last = scanner.nextInt();
        int sum = 0;

        for (int i = first; i <= last; i++) {
            sum += i;
        }
        System.out.println(sum);

        int summ = rangeSum(100,300);
        System.out.println(summ);
    }
}
