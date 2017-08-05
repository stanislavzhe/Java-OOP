package com.stas.JavaOOP.HomeWork.Lection9.SetMap.TreeSet_UniqueSortedPeople;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Stas on 20.07.2017.
 */
public class PeopleRunner {
    public static void main(String[] args) {
        People people = new People();
        //people.addToList(new Person(""));
        //people.addToList(new Person(null));
        people.addToList(new Person("John"));
        people.addToList(new Person("Bob"));
        people.addToList(new Person("Bob"));
        people.addToList(new Person("John"));
        people.addToList(new Person("Bob"));
        people.addToList(new Person("John"));
        people.addToList(new Person("Bob"));
        people.addToList(new Person("John"));
        people.addToList(new Person("Aron"));

        System.out.println("People list: " + people);
        Set<Person> sortSetList = new TreeSet<>();
        sortSetList.addAll(people.getPeople());
        System.out.println("List without double: " + sortSetList);
    }
}
