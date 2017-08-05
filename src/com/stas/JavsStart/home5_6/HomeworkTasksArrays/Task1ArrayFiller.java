package com.stas.JavsStart.home5_6.HomeworkTasksArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by stanislavz on 15-Mar-17.
 */
public class Task1ArrayFiller {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        System.out.print("Enter filler: ");
        int filler = scanner.nextInt();

        int[] array = new int[size];

        fill(array, filler);
        String s = Arrays.toString(array);
        System.out.println(s);

    }

    public static void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }
}
