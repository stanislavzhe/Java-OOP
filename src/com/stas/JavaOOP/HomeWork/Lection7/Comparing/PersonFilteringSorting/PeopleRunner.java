package com.stas.JavaOOP.HomeWork.Lection7.Comparing.PersonFilteringSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Stas on 20.07.2017.
 * Задан List<Person> people. Из исходного списка выбрать всех людей подросткового возраста (age >= 12 && age <= 17);
 * отсортировать по возрасту от старшего к младшему, в группах с одним возрастом - по имени в алфавитном порядке.
 */
public class PeopleRunner {
    public static void main(String[] args) {
        People people = new People();

        people.addToList(new Person("Aab",12));
        people.addToList(new Person("Bab",17));
        people.addToList(new Person("Zza",17));
        people.addToList(new Person("Zza",18));
        people.addToList(new Person("A",11));
        people.addToList(new Person("Tom",17));
        people.addToList(new Person("Bob",17));
        System.out.println(people);

        List<Person> teenList = people.listByAge(12,17);
        System.out.println("Teen list: " + teenList);
    }
}
