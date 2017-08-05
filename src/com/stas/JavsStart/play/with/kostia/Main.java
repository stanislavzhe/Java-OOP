package com.stas.JavsStart.play.with.kostia;

/**
 * Created by Stas on 12.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Cat barsik = new Cat("barsik");
        //barsik.setCount(barsik.getCount() + 1);
        //barsik.incrementCounter();
        System.out.println(barsik.getCount());
        System.out.println("barsik=" + barsik.getName());

        Cat murka = new Cat("murka");
        //murka.setCount(murka.getCount() + 1);
        //murka.incrementCounter();
        System.out.println(murka.getCount());
        System.out.println("murka=" + murka.getName());


        //Cat.incrementCounter();
    }


}
