package com.stas.JavsStart.lesson3and4;
/**
 * Created by PC-Dom on 04.03.2017.
 */
public class SymbolsApp {
    public static void main(String[] args) {
        String s = "Hello, Java. \nnew string. last sentence";
        char c = s.charAt(1);
        int a = s.length();
        int indexOff = s.indexOf("Java");
        String cOff = s.replaceFirst("ll", "");
        System.out.println(c);
        System.out.println(a);
        System.out.println(indexOff);
        System.out.println(cOff);


    }
}
