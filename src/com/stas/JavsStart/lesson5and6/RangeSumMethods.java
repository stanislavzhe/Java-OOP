package com.stas.JavsStart.lesson5and6;

/**
 * Created by PC-Dom on 11.03.2017.
 */
public class RangeSumMethods {
    public static void main(String[] args) {

        int sum1 = rangeSum(100, 300);
        int sum2 = rangeSum(300, 400);
        int min1 = min(sum1, sum2);
        int max1 = max(sum1, sum2);

        System.out.println(min1);
        System.out.println(max1);

    }
    public static int rangeSum(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {

            sum += i;
        }
        return sum;
    }
    public static int min (int a, int b) {
        return (a > b) ? b : a;
    }
    public static int max (int a, int b) {
        return (a > b) ? a : b;
    }}
