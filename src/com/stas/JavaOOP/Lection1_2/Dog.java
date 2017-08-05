package com.stas.JavaOOP.Lection1_2;

/**
 * Created by stanislavz on 24-Jun-17.
 */
public class Dog {
    public String name;
    public String ownerName;

    Dog(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    public void bark(String voice, int numberOfBarks) {
        for (int i = 0; i < numberOfBarks; i++) {
            System.out.println(voice);
        }
    }

    public String dogInfo () {
        return "Dog name " + name + " owner is " + ownerName;
    }
}
