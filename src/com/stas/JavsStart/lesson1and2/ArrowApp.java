package com.stas.JavsStart.lesson1and2;

/**
 * Created by stanislavz on 27-Feb-17.
 * Нарисовать стрелочку звездочками в консоле
 */
public class ArrowApp {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= (n / 2 + n % 2); i++) {
            int b = 1;
            while (b < i) {
                System.out.print(" ");
                b++;
            }
            System.out.println("*");

        }
        for (int i = 1; i <= (n / 2); i++) {
            int b = (n / 2);
            while (b > i) {
                System.out.print(" ");
                b--;
            }
            System.out.println("*");

        }

    }
}
