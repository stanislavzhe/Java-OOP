package com.stas.JavsStart.home5_6.HomeworkTasksArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by stanislavz on 15-Mar-17.
 */
public class Task4ArrayPositivesCounter {
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

        int countPositives = countPositives(array);

        System.out.println("Number of positive array element,  counter = " + countPositives);
    }

    public static int countPositives(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count += 1;
            }
        }
        return count;
    }
}
