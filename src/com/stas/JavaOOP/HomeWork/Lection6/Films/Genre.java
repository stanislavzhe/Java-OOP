package com.stas.JavaOOP.HomeWork.Lection6.Films;

/**
 * Created by Stas on 14.07.2017.
 */
public enum Genre {
    Action(0),
    Adventure(1),
    Comedy(2),
    Drama(3),
    Horror(4),
    Thriller(5),
    Scince_Fiction(6),
    War(7),
    Western(8);

    private final int number;

    Genre(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name();
    }
}
