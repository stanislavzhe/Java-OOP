package com.stas.JavaOOP.Lection1_2;

import java.util.ArrayList;

/**
 * Created by stanislavz on 26-Jun-17.
 */
public class Trainer {
    public String name;
    public ArrayList <Dog> dogList = new ArrayList<>();

    Trainer(String name) {
        this.name = name;
    }

    public void addDogToList (Dog dog) {
        dogList.add(dog);
    }

    public void dogsInfo () {
        for (Dog dog: dogList) {
            System.out.println(dog.name);
        }
    }
    public void coachDogsInList() {
        for (Dog dog: dogList) {
            System.out.print(dog.name + " ");
            dog.bark("wow",1);
        }
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", dogList=" + dogList +
                '}';
    }
}
