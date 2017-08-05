package com.stas.JavsStart.lesson5and6;

import java.util.Scanner;

/**
 * Created by PC-Dom on 11.03.2017.
 */
public class IOSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 1;
        int sum = 0;
        while (n != 0) {
            System.out.print("Enter value: ");
            n = scanner.nextInt();
            sum += n;
        }

        System.out.println("sum = " + sum);
    }
}
