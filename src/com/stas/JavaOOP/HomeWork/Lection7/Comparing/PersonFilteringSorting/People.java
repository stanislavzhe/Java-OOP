package com.stas.JavaOOP.HomeWork.Lection7.Comparing.PersonFilteringSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Stas on 20.07.2017.
 * Задан List<Person> people. Из исходного списка выбрать всех людей подросткового возраста (age >= 12 && age <= 17);
 * отсортировать по возрасту от старшего к младшему, в группах с одним возрастом - по имени в алфавитном порядке.
 */
public class People {
    List<Person> people = new ArrayList<Person>();

    public void addToList(Person person) {
        people.add(person);
    }

    public List<Person> listByAge(int ageFrom, int ageTo){
        List<Person> list = new ArrayList<Person>();
        for (Person person: people) {
            if (person.getAge() >= ageFrom && person.getAge() <= ageTo) {
                list.add(person);
            }
        }
        Comparator<Person> comp = Comparator.comparing(Person::getAge,Comparator.reverseOrder())
                .thenComparing(Person::getName,Comparator.naturalOrder());
        list.sort(comp);
        return list;
    }

    @Override
    public String toString() {
        return "People{" +
                "people=" + people +
                '}';
    }
}
