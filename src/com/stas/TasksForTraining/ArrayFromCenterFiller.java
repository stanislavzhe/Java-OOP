package com.stas.TasksForTraining;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by stanislavz on 11-Apr-17.
 */
public class ArrayFromCenterFiller {
    public static void main(String[] args) {
        int n = 10;

        if (n <= 0) {
            System.out.println("Array length <= 0");
        }

        int[] array = new int[n];
        if (n % 2 > 0) {
            for (int i = 0; i <= array.length / 2; i++) {
                array[array.length / 2 + i] = i;
                array[array.length / 2 - i] = i;
            }
        }
        if (n % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                array[array.length / 2 + i] = i;
                array[array.length / 2 - i - 1] = i;
            }
        }
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}