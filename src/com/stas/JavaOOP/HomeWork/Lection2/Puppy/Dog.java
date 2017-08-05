package com.stas.JavaOOP.HomeWork.Lection2.Puppy;

/**
 * Created by Stas on 28.06.2017.
 */
public class Dog extends Animal{

    Dog (String name) {
        super(name);
    }

    public void bite () {
        System.out.println(getName() + " bites Rrr");
    }

    public void bark () {
        System.out.println(getName() + " barks Wow");
    }
}
