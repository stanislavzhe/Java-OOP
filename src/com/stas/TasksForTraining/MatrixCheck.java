package com.stas.TasksForTraining;

import java.util.Arrays;

/**
 * Created by stanislavz on 31-Mar-17.
 */
public class MatrixCheck {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 0, 4, 0}, {3, 7, 0, 0, 0}, {11, 12, 0, 14, 0}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        boolean elements = false;

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] != 0) {
                    elements = false;
                    break;
                }
                elements = true;
            }
            if (elements == true) {
                break;
            }
        }

        System.out.println(elements);
    }
}
