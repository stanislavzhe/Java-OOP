package com.stas.JavsStart.home5_6.HomeworkTasksArrays;

import java.util.Scanner;

/**
 * Created by stanislavz on 15-Mar-17.
 */
public class Task7MatrixAverageCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows number: ");
        int row = scanner.nextInt();
        System.out.print("Enter coloms number: ");
        int col = scanner.nextInt();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter matrix element matrix[" + i + "][" + j + "]: ");
                int element = scanner.nextInt();
                matrix[i][j] = element;
            }
        }
        printMatrix(matrix);
        int avg = avg(matrix);
        System.out.println("Avarage of matrix elements = " + avg);
    }

    public static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int element = matrix[i][j];
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int avg(int[][] matrix) {
        int avg = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int matrixSize = row * col;
        int elementsSum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                elementsSum += matrix[i][j];
            }
        }
        avg = elementsSum / matrixSize;
        return avg;
    }
}
