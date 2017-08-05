package com.stas.JavsStart.testfolder;

/**
 * Created by Stas on 09.05.2017.
 */
public class mainClassTest {
    public static void main(String[] args) {
        System.out.println("hello");

        ClassTest test = new ClassTest();
        test.name = "Pupsik";
        System.out.println("name: " + test.name);
//
//        int cont = 10;
//        ClassTest test2;
//        if (cont == 10) {
//            test2 = new ClassTest();
//            test2.name = "Barsik";
//            System.out.println("name: " + test2.name);
//        }
////        test2.name = "New name rygik";
////        System.out.println("name: " + test2.name);

        System.out.println(test.con);
        System.out.println(test.value);
        test.con++;
        System.out.println(test.con);
        System.out.println(test.value);
    }
}
