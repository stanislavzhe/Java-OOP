package com.stas.JavaOOP.HomeWork.Lection2.Puppy;

/**
 * Created by Stas on 28.06.2017.
 */
public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    Animal(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(getName() + " runs Yeah");
    }

    public void jump() {
        System.out.println(getName() + " jumps Yeah");
    }
}
