package com.stas.JavsStart.lesson1and2;

/**
 * Created by stanislavz on 27-Feb-17.
 * 1. Написать программу выводящую в консоль младшие 5 цифр положительного десятичного числа.
 */
public class DigitsPrinter {
    public static void main(String[] args) {
        int n = 56;
        System.out.println((n / 10000) % 10);
        System.out.println((n / 1000) % 10);
        System.out.println((n / 100) % 10);
        System.out.println((n / 10) % 10);
        System.out.println(n % 10);
    }
}
