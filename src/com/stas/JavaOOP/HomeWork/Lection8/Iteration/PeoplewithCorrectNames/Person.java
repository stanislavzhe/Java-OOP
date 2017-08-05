package com.stas.JavaOOP.HomeWork.Lection8.Iteration.PeoplewithCorrectNames;

/**
 * Created by Stas on 20.07.2017.
 */
public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
