package com.stas.JavsStart.testfolder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by stanislavz on 16-Mar-17.
 */
public class ArrayTestCopy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter array size: ");
//        int size = scanner.nextInt();
//
//        int[] array = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter array element a[" + i + "]: ");
//            array[i] = scanner.nextInt();
//        }

        System.out.print("Enter shift position: ");
        int shiftPositions = scanner.nextInt();

        int[] array = {1, 2, 3, 4, 5};
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

        if (Math.abs(shiftPositions) > array.length) {
            shiftPositions = shiftPositions % array.length;
        }

        if (shiftPositions > 0 && shiftPositions % array.length != 0) {

            System.arraycopy(shiftedArray, array.length - Math.abs(shiftPositions), array, 0, Math.abs(shiftPositions));
            System.arraycopy(shiftedArray, 0, array, Math.abs(shiftPositions), array.length - Math.abs(shiftPositions));

        }
        if (shiftPositions < 0 && shiftPositions % array.length != 0) {

            System.arraycopy(shiftedArray, Math.abs(shiftPositions), array, 0, array.length - Math.abs(shiftPositions));
            System.arraycopy(shiftedArray, 0, array, array.length - Math.abs(shiftPositions), Math.abs(shiftPositions));
        }
    }
}

