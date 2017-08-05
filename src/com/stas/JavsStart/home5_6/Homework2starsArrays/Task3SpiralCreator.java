package com.stas.JavsStart.home5_6.Homework2starsArrays;

import java.util.Scanner;

/**
 * Created by stanislavz on 16-Mar-17.
 */
public class Task3SpiralCreator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows number: ");
        int row = scanner.nextInt();
        System.out.print("Enter coloms number: ");
        int col = scanner.nextInt();

        if (row <= 0 || col <= 0) {
            throw new IllegalArgumentException("0 or negative matrix coloms or rows; rows = " + row + ", coloms = " + col);
        }
        createMatrix(row, col);
        printMatrix(createMatrix(row,col));
    }

    public static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int element = matrix[i][j];
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int number = 1;
        int start = 0;

        if (rows == 1 && cols == 1) {
            matrix[rows - 1][cols - 1] = number;
            number++;
        }

        while (number < rows * cols + 1) {

            if (number == rows * cols) {
                matrix[rows/2][cols/2] = number;
                number++;
            }

            for (int i = start; i < cols - 1 - start; i++) {
                if (number < rows * cols + 1) {
                    matrix[start][i] = number;
                    number++;
                }
            }

            for (int i = start; i < rows - 1 - start; i++) {
                if (number < rows * cols + 1) {
                    matrix[i][cols - (1 + start)] = number;
                    number++;
                }
            }

            for (int i = cols - 1 - start; i >= start + 1; i--) {
                if (number < rows * cols + 1) {
                    matrix[rows - 1 - start][i] = number;
                    number++;
                }
            }

            for (int i = rows - 1 - start; i >= start + 1; i--) {
                if (number < rows * cols + 1) {
                    matrix[i][start] = number;
                    number++;
                }
            }
            start++;
        }
        return matrix;
    }
}
