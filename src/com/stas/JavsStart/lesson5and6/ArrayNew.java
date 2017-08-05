package com.stas.JavsStart.lesson5and6;

import java.util.Arrays;

/**
 * Created by PC-Dom on 11.03.2017.
 */
public class ArrayNew {
    public static void main(String[] args) {
        int [] array = new int [10];
        array[4] = 20;
        String s = Arrays.toString(array);
        System.out.println(s);
        int l = array.length;
    }
}
