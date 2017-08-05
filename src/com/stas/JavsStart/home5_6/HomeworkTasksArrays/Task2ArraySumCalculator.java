package com.stas.JavsStart.home5_6.HomeworkTasksArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by stanislavz on 15-Mar-17.
 */
public class Task2ArraySumCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter array element a[" + i + "]: ");
            array [i] = scanner.nextInt();
        }

        int sum = sum(array);
        String s = Arrays.toString(array);
        System.out.println("Array was: " + s);
        System.out.println("Sum of array elements, Sum = " + sum);

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
