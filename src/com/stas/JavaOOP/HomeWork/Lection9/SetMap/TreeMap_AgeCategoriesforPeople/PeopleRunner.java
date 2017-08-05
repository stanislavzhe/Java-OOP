package com.stas.JavaOOP.HomeWork.Lection9.SetMap.TreeMap_AgeCategoriesforPeople;

import java.nio.MappedByteBuffer;
import java.util.*;

/**
 * Created by Stas on 20.07.2017.
 */
public class PeopleRunner {
    public static void main(String[] args) {
        People people = new People();
        people.addToList(new Person("Bob", 12));
        people.addToList(new Person("John", 17));
        people.addToList(new Person("Bob", 13));
        people.addToList(new Person("John", 17));
        people.addToList(new Person("Aron", 19));

        System.out.println("People list: " + people);

        TreeMap<Integer, Person> sortSetList = new TreeMap<>();
        for (Person person : people.getPeople()) {
            sortSetList.put(person.getAge(), person);
        }

        System.out.println("People from 12 to 17: " + sortSetList.subMap(12,18));
        System.out.println("Youngest from 18: " + sortSetList.ceilingEntry(18));
        System.out.println("Oldest before 18: " + sortSetList.floorEntry(18));
    }
}
