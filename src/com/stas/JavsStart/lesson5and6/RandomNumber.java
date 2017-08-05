package com.stas.JavsStart.lesson5and6;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by PC-Dom on 11.03.2017.
 */
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int bound = 100;
        int start = 1;
        int n = random.nextInt(bound);
        System.out.println(n);

        Scanner scanner = new Scanner(System.in);

        int m = n + 1;
        int count = 0;

        while (n != m) {
            System.out.print("Enter value in range [" + start + ".." + bound + "]: ");
            m = scanner.nextInt();

            while (m > bound || m < start) {
                System.out.println("You enter value NOT in range");
                System.out.print("Enter value in range [" + start + ".." + bound + "]: ");
                m = scanner.nextInt();
                count++;
            }

            if (n >= m && start <= m) {
                start = m + 1;
            }
            if (n <= m && bound >= m) {
                bound = m - 1;
            }

            count++;

            if (n != m) {
                System.out.println("No, try again");
            }

        }
        System.out.println("You win, number was = " + n);
        System.out.println("You know it from " + count + " choice");
    }
}
