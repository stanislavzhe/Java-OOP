package com.stas.TasksForTraining;

import java.util.Arrays;

/**
 * Created by stanislavz on 03-Apr-17.
 */
public class MatrixPrintGood {

    static String markPlayer1 = "X";
    static String markPlayer2 = "O";
    static int matrixLength = 3;
    static String[][] playGround = new String[matrixLength][matrixLength];
    static int moveCounter = matrixLength * matrixLength;

    public static void main(String[] args) {

        System.out.println("Playground field:");
        fillPlaygroundElementsNumbers(playGround);
        playGround[0][0] = "X";
        playGround[2][1] = "O";
        printGoodPlayground(playGround);
    }

    private static void fillPlaygroundElementsNumbers(String[][] matrix) {
        int element = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = "ID " + element;
                element++;
            }
        }
    }

    private static void printPlayground(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void printGoodPlayground(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrixLength * 7; j++) {
                System.out.print("-");
            }
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {

                if (matrix[i][j] != markPlayer1 && matrix[i][j] != markPlayer2) {
                    System.out.print("|");

                    System.out.print(matrix[i][j] + " ");

                    if (j == matrix.length - 1) {
                        System.out.println("|");
                    }
                }
                if (matrix[i][j] == markPlayer1 || matrix[i][j] == markPlayer2) {
                    System.out.print("|");

                    System.out.print("  " + matrix[i][j] + "  ");

                    if (j == matrix.length - 1) {
                        System.out.println("|");
                    }
                }
            }
        }
        for (int j = 0; j < matrixLength * 7; j++) {
            System.out.print("-");
        }
    }
}
