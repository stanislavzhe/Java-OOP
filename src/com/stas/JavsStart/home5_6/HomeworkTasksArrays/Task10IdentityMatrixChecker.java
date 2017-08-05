package com.stas.JavsStart.home5_6.HomeworkTasksArrays;

import java.util.Scanner;

/**
 * Created by stanislavz on 15-Mar-17.
 */
public class Task10IdentityMatrixChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows number: ");
        int row = scanner.nextInt();
        System.out.print("Enter coloms number: ");
        int col = scanner.nextInt();

        if (row <= 0 && col <= 0) {
            throw new IllegalArgumentException("0 or negative matrix coloms and rows; rows = " + row + ", coloms = " + col);
        }
        if (row != col) {
            throw new IllegalArgumentException("Matrix not square; rows = " + row + ", coloms = " + col);
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

        boolean squareMatrix= isIdentity(matrix);
        System.out.println("Matrix is unit: " + squareMatrix);
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

    public static boolean isIdentity(int[][] matrix) {
        boolean squareMatrix = true;
        int row = matrix.length;
        int col = matrix[0].length;
        if (row <= 0 && col <= 0) {
            throw new IllegalArgumentException("0 or negative matrix coloms and rows; rows = " + row + ", coloms = " + col);
        }
        if (row != col) {
            throw new IllegalArgumentException("Matrix not square; rows = " + row + ", coloms = " + col);
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j && matrix[i][j] != 1) {
                    squareMatrix = false;
                }
                if (i != j && matrix[i][j] != 0){
                    squareMatrix = false;
                }
            }
        }
        return squareMatrix;
    }
}
