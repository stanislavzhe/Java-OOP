package com.stas.JavaOOP.HomeWork.Lection2.Puppy;

/**
 * Created by Stas on 28.06.2017.
 * Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать
 */
public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Sam");

        System.out.println("Puppy name: " + puppy.getName());
        puppy.bark();
        puppy.jump();
        puppy.run();
        puppy.bite();
    }
}
