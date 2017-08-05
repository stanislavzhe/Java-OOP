package com.stas.TasksForTraining;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by stanislavz on 27-Mar-17.
 * * Написать игру «Крестики нолики» используя
 * двухмерные массивы.
 */
public class TicTacToe {
    private static String markPlayer1 = "X";
    private static String markPlayer2 = "O";
    private static int matrixLength = 3;
    private static String[][] playGround = new String[matrixLength][matrixLength];
    private static int moveCounter = matrixLength * matrixLength;

    public static void main(String[] args) {

        System.out.println("Playground field:");
        fillPlaygroundElementsNumbers(playGround);
        printPlayground(playGround);

        while ((!checkForWin(playGround, markPlayer1)) || (!checkForWin(playGround, markPlayer2))) {

            playerMove(playGround, markPlayer1);
            if (checkForWin(playGround, markPlayer1)) {
                System.out.println("Player with mark " + markPlayer1 + " win!");
                break;
            }
            //last move check
            if (moveCounter == 0) {
                System.out.println("Draw - no one won");
                break;
            }
            playerMove(playGround, markPlayer2);
            if (checkForWin(playGround, markPlayer2)) {
                System.out.println("Player with mark " + markPlayer2 + " win!");
                break;
            }
            //last move check
            if (moveCounter == 0) {
                System.out.println("Draw - no one won");
                break;
            }
        }
        System.out.println("Game over");
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
            for (int j = 0; j < matrixLength * 7; j++) {
                System.out.print("-");
            }
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {

                //for element without mark
                if (!Objects.equals(matrix[i][j], markPlayer1) && !Objects.equals(matrix[i][j], markPlayer2)) {
                    System.out.print("|");

                    System.out.print(matrix[i][j] + " ");

                    if (j == matrix.length - 1) {
                        System.out.println("|");
                    }
                }
                //for element with mark
                if (Objects.equals(matrix[i][j], markPlayer1) || Objects.equals(matrix[i][j], markPlayer2)) {
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
        System.out.println();
    }

    private static int inputElement(String[][] matrix) {
        Scanner scanner = new Scanner(System.in);

        String textFromConsole = "";
        while (textFromConsole.isEmpty()) {

            System.out.print("Enter element position ID where you want to set mark, ID = ");
            String result = scanner.nextLine();

            try {
                int resultInt = Integer.parseInt(result);
                if (resultInt < 1 || resultInt > matrix.length * matrix.length) {
                    System.out.println("You enter elemnt ID not in range");
                    continue;
                }
                if (!emptyElementCellCheck(matrix, resultInt)) {
                    System.out.println("There is a mark in this position, try other one");
                    continue;
                }
                textFromConsole = result;
            } catch (NumberFormatException e) {
                System.out.println("You enter wrong elemnt ID");
                continue;
            }
        }
        int idFromKeyboard = Integer.valueOf(textFromConsole) - 1;
        String inputElementID = Integer.toString(idFromKeyboard, matrix.length); // from id 0-8 to id 00-22

        return Integer.valueOf(inputElementID);

    } //input element from keybord

    private static boolean emptyElementCellCheck(String[][] matrix, int result) {

        int idFromKeyboard = result - 1;
        int x = idFromKeyboard / matrix.length;
        int y = idFromKeyboard % matrix.length;

        return !(Objects.equals(matrix[x][y], markPlayer1) || Objects.equals(matrix[x][y], markPlayer2));
    }

    private static void setElementMark(String[][] matrix, int elementID, String mark) {
        int rowID = elementID / 10;
        int colID = elementID % 10;
        matrix[rowID][colID] = mark;
    } //set mark to element in matrix

    private static void playerMove(String[][] matrix, String playerMark) {
        System.out.println("Player with mark: " + playerMark + ", your turn!");

        setElementMark(matrix, inputElement(matrix), playerMark);
        printPlayground(matrix);
        checkForWin(matrix, playerMark);
        moveCounter--;
    }

    private static boolean checkForWin(String[][] matrix, String mark) {
        boolean winInMatrix = false;

        winInMatrix = checkForWinInRow(matrix, mark);
        if (winInMatrix == true) {
            return winInMatrix;
        }

        winInMatrix = checkForWinInCol(matrix, mark);
        if (winInMatrix == true) {
            return winInMatrix;
        }

        winInMatrix = checkForWinInMajorDiagonal(matrix, mark);
        if (winInMatrix == true) {
            return winInMatrix;
        }

        winInMatrix = checkForWinInMinorDiagonal(matrix, mark);
        return winInMatrix;
    }

    private static boolean checkForWinInRow(String[][] matrix, String mark) {
        boolean allNeededelements = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (!Objects.equals(matrix[i][j], mark)) {
                    allNeededelements = false;
                    break;
                }
                allNeededelements = true;
            }
            if (allNeededelements == true) {
                break;
            }
        }
        return allNeededelements;
    }

    private static boolean checkForWinInCol(String[][] matrix, String mark) {
        boolean allNeededelements = true;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (!Objects.equals(matrix[j][i], mark)) {
                    allNeededelements = false;
                    break;
                }
                allNeededelements = true;
            }
            if (allNeededelements == true) {
                break;
            }
        }
        return allNeededelements;
    }

    private static boolean checkForWinInMajorDiagonal(String[][] matrix, String mark) {
        boolean allNeededelements = true;
        for (int i = 0; i < matrix.length; i++) {
            if (!Objects.equals(matrix[i][i], mark)) {
                allNeededelements = false;
                break;
            }
            allNeededelements = true;
        }
        return allNeededelements;
    }

    private static boolean checkForWinInMinorDiagonal(String[][] matrix, String mark) {
        boolean allNeededelements = true;
        for (int i = 0; i < matrix.length; i++) {
            if (!Objects.equals(matrix[i][matrix.length - 1 - i], mark)) {
                allNeededelements = false;
                break;
            }
            allNeededelements = true;
        }
        return allNeededelements;
    }
}
