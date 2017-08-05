package com.stas.JavaOOP.HomeWork.Lection9.SetMap.TreeSet_UniqueSortedPeople;

/**
 * Created by Stas on 20.07.2017.
 */
public class Person implements Comparable<Person>{
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

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
