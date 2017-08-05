package com.stas.JavsStart.home3_4.HomeworkTasksLoops;

import java.util.Scanner;

/**
 * Created by stanislavz on 10-Mar-17.
 */
public class Task5FilledMatrixPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row value: ");
        int rows = scanner.nextInt();
        System.out.print("Enter cols value: ");
        int cols = scanner.nextInt();
        System.out.print("Enter filler value: ");
        int filler = scanner.nextInt();

        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rows and cols value must be > 0, but actually is rows = " + rows + "; cols = " + cols);

        }
        else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    System.out.print(filler + " ");
                }
                System.out.println();
            }

        }

    }
}
