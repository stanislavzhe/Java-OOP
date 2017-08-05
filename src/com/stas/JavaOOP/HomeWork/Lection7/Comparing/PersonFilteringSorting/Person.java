package com.stas.JavaOOP.HomeWork.Lection7.Comparing.PersonFilteringSorting;

/**
 * Created by Stas on 20.07.2017.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (age <=0 || age >= 120) {
            throw new IllegalArgumentException("Age out of bounds: " + age);
        }
        if (name.equals("")){
            throw new IllegalArgumentException("Name is empty: " + name);
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}";
    }
}
