package com.stas.JavsStart.home3_4.HomeworkTasksLoops;

import java.util.Scanner;

/**
 * Created by stanislavz on 10-Mar-17.
 */
public class Task4FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        int n = scanner.nextInt();
        long factorial = 1;

        if (n >= 1 && n <= 20) {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }
        if (n < 1 || n > 20) {
            throw new IllegalArgumentException("N must be in the range [1..20], but actually is " + n);
        }

        System.out.println("Factorial for " + n + " = " + factorial);
    }
}
