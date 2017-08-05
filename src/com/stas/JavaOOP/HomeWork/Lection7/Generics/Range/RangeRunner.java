package com.stas.JavaOOP.HomeWork.Lection7.Generics.Range;

/**
 * Created by Stas on 20.07.2017.
 */
public class RangeRunner {
    public static void main(String[] args) {
        System.out.println(new Range<Integer>(-11,10));
        System.out.println(new Range<Double>(1.1,1.2));
    }
}
