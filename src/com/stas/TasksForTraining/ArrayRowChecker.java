package com.stas.TasksForTraining;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Stas on 27.03.2017.
 */
public class ArrayRowChecker {
    public static void main(String[] args) {
        String[][] matrix = {{"7", "0", "7"}, {"0", "7", "7"}, {"7", "0", "0"}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        boolean allNeededElements = false;
        allNeededElements = colElementsCheck(matrix);
        System.out.println(allNeededElements);

        allNeededElements = false;
        allNeededElements = rowElementsCheck(matrix);
        System.out.println(allNeededElements);

        allNeededElements = false;
        allNeededElements = majorDiagonalElementCheck(matrix);
        System.out.println(allNeededElements);

        allNeededElements = false;
        allNeededElements = minorDiagonalElementCheck(matrix);
        System.out.println(allNeededElements);


    }

    private static boolean colElementsCheck(String[][] matrix) {
        boolean allNeededelements = true;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] != "7") {
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

    private static boolean rowElementsCheck(String[][] matrix) {
        boolean allNeededelements = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != "7") {
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

    private static boolean majorDiagonalElementCheck(String[][] matrix) {
        boolean allNeededelements = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != "7") {
                allNeededelements = false;
                break;
            }
            allNeededelements = true;
        }
        return allNeededelements;
    }

    private static boolean minorDiagonalElementCheck(String[][] matrix) {
        boolean allNeededelements = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix.length - 1 - i] != "7") {
                allNeededelements = false;
                break;
            }
            allNeededelements = true;
        }
        return allNeededelements;
    }
}