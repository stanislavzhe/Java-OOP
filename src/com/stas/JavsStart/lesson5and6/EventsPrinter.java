package com.stas.JavsStart.lesson5and6;

import java.util.Scanner;

/**
 * Created by PC-Dom on 11.03.2017.
 */
public class EventsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int first = scanner.nextInt();
        System.out.print("Enter last value: ");
        int last = scanner.nextInt();

        if (first % 2 != 0) {
            first++;
        }

        for (int i = first; i <= last; i++) {
            System.out.print(i + " ");
        }
    }
}

