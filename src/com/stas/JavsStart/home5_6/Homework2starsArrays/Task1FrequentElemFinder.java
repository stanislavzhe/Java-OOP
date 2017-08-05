package com.stas.JavsStart.home5_6.Homework2starsArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by stanislavz on 16-Mar-17.
 */
public class Task1FrequentElemFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter array element a[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        int element = findFrequentElem(array);
        String s = Arrays.toString(array);
        System.out.println("Array was: " + s);
        System.out.println("Element = " + element);
    }

    public static int findFrequentElem(int[] array) {
        int element = array[0];
        int counter = 0;
        int elemcounter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                //
                if (array[i] == array[j]) {
                    elemcounter ++;
                }
                if (elemcounter > counter) {
                    element = array[i];
                    counter = elemcounter;
                }
            }
        }
        return element;
    }
}
