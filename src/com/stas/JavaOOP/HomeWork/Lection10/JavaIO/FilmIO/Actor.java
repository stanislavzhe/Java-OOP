package com.stas.JavaOOP.HomeWork.Lection10.JavaIO.FilmIO;

/**
 * Created by Stas on 14.07.2017.
 */
public class Actor {
    private String name;
    private String surname;
    private int age;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}
