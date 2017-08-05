package com.stas.JavaOOP.HomeWork.Lection8.Iteration.PeoplewithCorrectNames;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Stas on 20.07.2017.
 */
public class PeopleRunner {
    public static void main(String[] args) {
        People people = new People();
        people.addToList(new Person(""));
        people.addToList(new Person(null));
        people.addToList(new Person("Bob"));
        people.addToList(new Person(""));
        people.addToList(new Person("John"));
        System.out.println(people);
        people.deletePersonWithEmtpyName();
        System.out.println("List without empty and null: " + people);
    }
}
