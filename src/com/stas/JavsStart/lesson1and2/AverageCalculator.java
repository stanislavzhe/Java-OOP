package com.stas.JavsStart.lesson1and2;

/**
 * Created by stanislavz on 27-Feb-17.
 * 3. Написать программу находящую среднее арифметическое двух целых чисел типа int. Учитывать возможность переполнения. Приведение типов запрещено.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        int a = 1;
        int b = -2;
        int avg = (a / 2) + (b / 2);
        int avglast = ((a % 2) + (b % 2)) / 2;
        System.out.println(avg + avglast);
    }
}
