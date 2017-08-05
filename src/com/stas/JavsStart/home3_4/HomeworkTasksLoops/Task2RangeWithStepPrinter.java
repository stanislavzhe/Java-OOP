package com.stas.JavsStart.home3_4.HomeworkTasksLoops;

import java.util.Scanner;

/**
 * Created by stanislavz on 10-Mar-17.
 */
public class Task2RangeWithStepPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int first = scanner.nextInt();
        System.out.print("Enter last value: ");
        int last = scanner.nextInt();
        System.out.print("Enter step value: ");
        int step = scanner.nextInt();

        boolean bigger = first > last && step < 0;
        boolean smaller = first <= last && step > 0;

        if (smaller) {
            for (int i = first; i <= last; i = i + step) {
                System.out.print(i + " ");
            }
        }
        if (bigger) {
            for (int j = first; j >= last; j = j + step) {
                System.out.print(j + " ");
            }
        }
        if (!smaller && !bigger) {
            throw new IllegalArgumentException("step should be > 0 if first <= last or step should be < 0 if first > last");
        }
    }
}
