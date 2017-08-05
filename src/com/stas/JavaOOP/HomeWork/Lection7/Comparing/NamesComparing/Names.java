package com.stas.JavaOOP.HomeWork.Lection7.Comparing.NamesComparing;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Stas on 20.07.2017.
 * Создать класс Names (List<String> names), который умеет выполнять следующие действия:
 * 1. Отсортировать имена в алфавитном порядке.
 * 2. Отсортировать имена в алфавитном порядке по убыванию.
 * 3. Найти наименьшее имя в алфавитном порядке (использовать метод Collections.min(...)).
 * 4. Отсортировать имена по количеству букв.
 * 5. Отсортировать имена по количеству букв, а в группах, где количество букв одинаковое, - в алфавитном порядке по убыванию.
 */
public class Names {
    private List<String> names = new ArrayList<>();

    public void addToList(String name) {
        names.add(name);
    }

    public void sortByName() {
        Collections.sort(names);
    }

    public void sortReverseByName() {
        Collections.sort(names);
        Collections.reverse(names);
    }

    public String minNameLength() {
        return Collections.min(names);
    }

    public void sortByLength() {
        Comparator.comparingInt(String::length);
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                }
                if (o1.length() > o2.length()) {
                    return 1;
                }

                return 0;
            }
        };
        Collections.sort(names, comp);
    }

    public void sortByLengthbyZYX(){
        this.sortReverseByName();
        this.sortByLength();
    }

    @Override
    public String toString() {
        return "Names{" +
                "names=" + names +
                '}';
    }
}
