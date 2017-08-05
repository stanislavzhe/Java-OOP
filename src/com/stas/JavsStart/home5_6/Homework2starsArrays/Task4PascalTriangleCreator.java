package com.stas.JavsStart.home5_6.Homework2starsArrays;

import java.util.Scanner;

/**
 * Created by stanislavz on 22-Mar-17.
 */
public class Task4PascalTriangleCreator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter triangle size: ");
        int n = scanner.nextInt();

        if (n < 0) {
            throw new IllegalArgumentException("Triangle size should be > 0; now it = " + n);
        }

        int [][]matrix = createPascalTriangle(n);
        printMatrix(matrix);
    }

    public static int[][] createPascalTriangle(int n) {
        int[][] matrix = new int[n + 1][];

        for (int i = 0; i <= n; i++) {
            matrix[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i - 1][j - 1];
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i + 1; j++) {
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
