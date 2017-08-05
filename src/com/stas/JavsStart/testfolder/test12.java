package com.stas.JavsStart.testfolder;

/**
 * Created by stanislavz on 13-Mar-17.
 */
public class test12 {
    public static void main(String[] args) {
        int i = 11;


        int k = 0;

        for (int j = 2; j <= i; j++) {

            if (i % j == 0) {
                k = k + 1;
            }

            if (j == i && k == 1) {
                System.out.println(j);
            }
        }

    }

}
