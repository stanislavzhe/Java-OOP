package com.stas.JavsStart.lesson7and8;

import java.util.Arrays;

/**
 * Created by Admin on 18.03.2017.
 */
public class ArraySeqFiller {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];

        int[] arrayTwo = {23, 100, 33, 35};
        int[] arrayThree = {};

        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(arraySort(arrayTwo));

        maxElem(arrayThree);
    }

    public static void seqFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public static void reverseSeqFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - 1 - i;
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static void reverseArray(int[] array) {
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int a = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = a;
        }
    }

    public static void maxElem(int[] array) {
        if (array.length <= 0) {
            throw new IllegalArgumentException("array not initialized");
        }
        int max = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("max array element = " + max);
    }

    public static boolean arraySort(int[] array) {
        boolean sort = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sort = false;
            }
        }
        return sort;
    }
}
