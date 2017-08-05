package com.stas.JavaOOP.HomeWork.Lection7.Generics.Pair;

/**
 * Created by Stas on 19.07.2017.
 */
public class PairRunner {
    public static void main(String[] args) {
        System.out.println(new Pair<>(1, false));
        System.out.println(new Pair<>(2, "Hello"));

    }
}
