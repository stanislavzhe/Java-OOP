package com.stas.JavsStart.home3_4.HomeworkTypesInputString;

import java.util.Scanner;

/**
 * Created by stanislavz on 09-Mar-17.
 * С клавиатуры вводятся 2 числа типа int: a, b.
 Написать программу вычисления среднего арифметического двух чисел a, b.
 Аргументы и результат принимают любые значения из диапазона int! Поэтому
 программа должна работать и для граничных чисел.
 */
public class Task5AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a: ");
        long a = scanner.nextInt();
        System.out.print("Enter b: ");
        long b = scanner.nextInt();

        double avr = (double) (a + b) / 2;

        System.out.println(avr);

    }
}
