package com.stas.TasksForTraining;

import java.util.Arrays;

/**
 * Created by stanislavz on 27-Mar-17.
 */
public class ArrayMirrorReflection {
    public static void main(String[] args) {
        int [] array = {1,-2,3,-4,5};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            swapTwoElements(array,i,array.length - 1 - i);
        }
        System.out.println(Arrays.toString(array));
    }
    private static void swapTwoElements(int [] array, int elementOne, int elementTwo) {
        int c = array[elementOne];
        array[elementOne] = array[elementTwo];
        array[elementTwo] = c;
    }
}
