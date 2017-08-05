package com.stas.JavsStart.lesson1and2;

/**
 * Created by stanislavz on 27-Feb-17.
 * Количество счастливых талончиков
 */
public class LuckyTicket {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 999999; i++) {
            int a1 = (i % 10);
            int a2 = ((i / 10) % 10);
            int a3 = ((i / 100) % 10);
            int b1 = ((i / 1000) % 10);
            int b2 = ((i / 10000) % 10);
            int b3 = ((i / 100000) % 10);
            int c1 = a1 + a2 + a3;
            int c2 = b1 + b2 + b3;
            if (c1 == c2) {
                count += 1;
            }

        }
        System.out.println(count);
        System.out.println((double)count / 999999 * 100);
    }

}
