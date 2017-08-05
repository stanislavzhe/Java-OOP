package com.stas.JavsStart.home5_6.Homework2starsArrays;

/**
 * Created by stanislavz on 22-Mar-17.
 */
public class Task5MatrixPacking {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 2}, {0, 0, 0}, {3, 0, 4}};
        printMatrix(matrix);
        System.out.println();

        printMatrix(packMatrix(matrix));

    }

    public static int[][] packMatrix(int[][] sourceMatrix) {
        int rowLength = sourceMatrix.length;
        int colLength = sourceMatrix[0].length;

        for (int i = 0; i < rowLength; i++) {
            if (isAllElementsInArrayZero(sourceMatrix[i]) == true) {
                sourceMatrix = newMatrixDeleteRow(sourceMatrix, i);
                rowLength = sourceMatrix.length;
                colLength = sourceMatrix[0].length;
                i = 0;
            }
        }

//

        return sourceMatrix;
    }

    public static int[][] newMatrixDeleteCol(int[][] matrix, int col) {
        int[][] newMatrixDeleteCol = new int[matrix.length][matrix[0].length - 1];

        for (int i = 0; i < matrix.length; i++) {
            int next = 0;
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (j >= col) {
                    next = 1;
                }
                int newCol = j + next;
                newMatrixDeleteCol[i][j] = matrix[i][newCol];
            }
        }
        return newMatrixDeleteCol;
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

    private static boolean isAllElementsInArrayZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private static int[][] newMatrixDeleteRow(int[][] matrix, int row) {
        int[][] result = new int[matrix.length - 1][matrix[0].length];

        for (int i = 0; i < row; i++) {
            copyArrayElements(matrix[i], result[i]);
        }
        for (int i = row; i < matrix.length - 1; i++) {
            copyArrayElements(matrix[i + 1], result[i]);
        }

        return result;
    }

    private static void copyArrayElements(int[] from, int[] to) {
        for (int i = 0; i < to.length; i++) {
            to[i] = from[i];
        }
    }
}
