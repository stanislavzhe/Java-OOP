package com.stas.JavsStart.home3_4.HomeworkTasksLoops;

import java.util.Scanner;

/**
 * Created by stanislavz on 10-Mar-17.
 */
public class Task3EvensRangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int first = scanner.nextInt();
        System.out.print("Enter last value: ");
        int last = scanner.nextInt();

        if (first <= last) {
            for (int i = ((first + 1) / 2) * 2; i <= last; i = i + 2) {
                System.out.print(i + " ");
            }
        }
        if (first > last) {
                System.out.print(" ");
        }

    }
}
