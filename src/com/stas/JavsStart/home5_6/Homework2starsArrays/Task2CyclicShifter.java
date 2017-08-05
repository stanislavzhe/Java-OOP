package com.stas.JavsStart.home5_6.Homework2starsArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by stanislavz on 16-Mar-17.
 */
public class Task2CyclicShifter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter array element a[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter shift position: ");
        int shiftPositions = scanner.nextInt();

        //array = null;
        //int[] emptyArray = new int[4];
        System.out.println("Array was: " + Arrays.toString(array));
        cyclicShift(array, shiftPositions);
        System.out.println("Shifted array: " + Arrays.toString(array));
    }

    public static void cyclicShift(int[] array, int shiftPositions) {
        if (array == null) {
            throw new IllegalArgumentException("Array = null");
        }
        int[] shiftedArray = Arrays.copyOf(array, array.length);
        int elementId = 0;

        if (Math.abs(shiftPositions) > array.length) {
            shiftPositions = shiftPositions % array.length;
        }

        if (shiftPositions > 0 && shiftPositions % array.length != 0) {

            for (int i = array.length - shiftPositions; i < array.length; i++) {
                array[elementId] = shiftedArray[i];
                elementId++;
            }
            for (int i = 0; i < array.length - shiftPositions; i++) {
                array[elementId] = shiftedArray[i];
                elementId++;
            }
        }
        if(shiftPositions < 0 && shiftPositions % array.length != 0) {
            for (int i = Math.abs(shiftPositions); i < array.length; i++) {
                array[elementId] = shiftedArray[i];
                elementId++;
            }
            for (int i = 0; i < Math.abs(shiftPositions); i++) {
                array[elementId] = shiftedArray[i];
                elementId++;
            }
        }
    }
}
