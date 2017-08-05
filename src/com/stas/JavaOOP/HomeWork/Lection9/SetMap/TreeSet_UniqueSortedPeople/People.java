package com.stas.JavaOOP.HomeWork.Lection9.SetMap.TreeSet_UniqueSortedPeople;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Created by Stas on 20.07.2017.
 * Задан List<Person> people.
 * Написать метод, удаляющий из списка всех людей,
 * у которых имя null или пустая строка. Для удаления использовать итератор
 */
public class People{
    private List<Person> people = new ArrayList<>();

    public void addToList(Person person) {
        people.add(person);
    }

    public void deletePersonWithEmtpyName(){
        Iterator<Person> iter = people.iterator();
        while(iter.hasNext()){
            Person person = iter.next();
            if (Objects.isNull(person.getName()) || person.getName().isEmpty()){
                iter.remove();
            }
        }
    }

    public List<Person> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return "People{" +
                "people=" + people +
                '}';
    }
}
