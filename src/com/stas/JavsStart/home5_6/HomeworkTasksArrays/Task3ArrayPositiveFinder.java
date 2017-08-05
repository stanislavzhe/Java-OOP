package com.stas.JavsStart.home5_6.HomeworkTasksArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by stanislavz on 15-Mar-17.
 */
public class Task3ArrayPositiveFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter array element a[" + i + "]: ");
            array[i] = scanner.nextInt();
        }


        String s = Arrays.toString(array);
        System.out.println("Array was: " + s);

        int firstPositiveIndex = findFirstPositiveElemIndex(array);
        int lastPositiveIndex = findLastPositiveElemIndex(array);
        if (firstPositiveIndex < 0 || lastPositiveIndex < 0) {
            System.out.println("No positive elements; " + firstPositiveIndex);
        } else {
            System.out.println("First positive element index = " + firstPositiveIndex + "; element was = " + array[firstPositiveIndex]);
            System.out.println("Last positive element index = " + lastPositiveIndex + "; element was = " + array[lastPositiveIndex]);
        }
    }


    public static int findFirstPositiveElemIndex(int[] array) {
        int firstPositiveIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                firstPositiveIndex = i;
                i = array.length;
            }
        }
        return firstPositiveIndex;
    }

    public static int findLastPositiveElemIndex(int[] array) {
        int lastPositiveIndex = -1;
        for (int i = (array.length - 1); i >= 0; i--) {
            if (array[i] > 0) {
                lastPositiveIndex = i;
                i = -1;
            }
        }
        return lastPositiveIndex;
    }
}