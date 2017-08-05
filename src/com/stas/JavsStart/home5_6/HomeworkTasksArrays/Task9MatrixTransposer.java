package com.stas.JavsStart.home5_6.HomeworkTasksArrays;

import java.util.Scanner;

/**
 * Created by stanislavz on 15-Mar-17.
 */
public class Task9MatrixTransposer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows number: ");
        int row = scanner.nextInt();
        System.out.print("Enter coloms number: ");
        int col = scanner.nextInt();

        if (row <= 0 && col <= 0) {
            throw new IllegalArgumentException("0 or negative matrix coloms and rows; rows = " + row + ", coloms = " + col);
        }

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter matrix element matrix[" + i + "][" + j + "]: ");
                int element = scanner.nextInt();
                matrix[i][j] = element;
            }
        }
        printMatrix(matrix);
        System.out.println();

        int[][] transposeMatrix = transpose(matrix);
        printMatrix(transposeMatrix);
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

    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row <= 0 && col <= 0) {
            throw new IllegalArgumentException("0 or negative matrix coloms and rows; rows = " + row + ", coloms = " + col);
        }
        int[][] transposeMatrix = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transposeMatrix [i][j] = matrix [j][i];
            }
        }
        return transposeMatrix;
    }
}
