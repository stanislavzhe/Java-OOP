package com.stas.JavsStart.home5_6.HomeworkTasksArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by stanislavz on 15-Mar-17.
 */
public class Task5SequenceArrayCreator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        if (size < 0) {
            throw new IllegalArgumentException("Array size should be > 0, now it size = " + size);
        }

        int[] array = createSequenceArray(size);

        String s = Arrays.toString(array);
        System.out.println("Array now: " + s);
    }

    public static int[] createSequenceArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
}