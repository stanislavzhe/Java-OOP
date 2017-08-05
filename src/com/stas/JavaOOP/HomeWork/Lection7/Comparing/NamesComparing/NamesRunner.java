package com.stas.JavaOOP.HomeWork.Lection7.Comparing.NamesComparing;

/**
 * Created by Stas on 20.07.2017.
 */
public class NamesRunner {
    public static void main(String[] args) {
        Names names = new Names();
        names.addToList("Tom");
        names.addToList("Bob");
        names.addToList("Boba");
        names.addToList("Bo");
        names.addToList("Aam");
        names.addToList("Zzm");
        System.out.println(names);

        names.sortReverseByName();
        System.out.println("Sort reverse by name: " + names);

        names.sortByName();
        System.out.println("Sort by name: " + names);

        System.out.println("Min name: " + names.minNameLength());

        names.sortByLength();
        System.out.println("Sort by length: " + names);

        names.sortByLengthbyZYX();
        System.out.println("Sort by length and by ZYX: " + names);
    }
}
