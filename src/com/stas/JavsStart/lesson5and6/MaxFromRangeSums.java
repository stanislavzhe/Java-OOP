package com.stas.JavsStart.lesson5and6;

import java.util.Scanner;

/**
 * Created by PC-Dom on 11.03.2017.
 */
public class MaxFromRangeSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum1f = 100;
        int sum1l = 200;
        int sum1 = 0;
        int sum2f = 300;
        int sum2l = 400;
        int sum2 = 0;

        for (int i = sum1f; i <= sum1l; i++) {
            sum1 += i;
        }
        System.out.println(sum1);


        for (int i = sum2f; i <= sum2l; i++) {
            sum2 += i;
        }
        System.out.println(sum2);

//        int max = 0;
//        if (sum1 > sum2) {
//            max = sum1;
//        } else {
//            max = sum2;
//            ;
//        }
        int max = (sum1 > sum2 ) ? sum1 : sum2; //тернарный оператор

        System.out.println(max);
    }
}