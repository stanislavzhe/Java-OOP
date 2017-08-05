package com.stas.TasksForTraining;

import java.util.Arrays;

/**
 * Created by stanislavz on 24-Mar-17.
 */
public class ArrayChecker {
//    public static void main(String[] args) {
//        int[] firstArray = {1, 3, 2, 4, 5};
//        int[] secondArray = {1, 2, 3};
//
//        System.out.println(arrayIncludesSecondArray(firstArray, secondArray));
//    }

    public static boolean arrayIncludesSecondArray(int[] firstArray, int[] secondArray) {
        boolean isArrayIncludesSecondArray = false;
        for (int secondElementId = 0; secondElementId < secondArray.length; secondElementId++) {

            for (int elementId = 0; elementId < firstArray.length; elementId++) {

                if (secondArray[secondElementId] == firstArray[elementId]) {
                    isArrayIncludesSecondArray = true;
                    //elementId = firstArray.length;
                    break;
                } else {
                    isArrayIncludesSecondArray = false;
                }
            }
            if (isArrayIncludesSecondArray == false) {
                break;
                //secondElementId = secondArray.length;
            }
        }
        return isArrayIncludesSecondArray;
    }
}
