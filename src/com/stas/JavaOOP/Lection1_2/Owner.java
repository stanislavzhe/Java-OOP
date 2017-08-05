package com.stas.JavaOOP.Lection1_2;

/**
 * Created by stanislavz on 24-Jun-17.
 */
public class Owner {
    public String name;
    public Dog dog;

    Owner(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public void giveCommand(){
        dog.bark("wow",10);
    }

    @Override
    public String toString() {
        return "Owner " +
                "name " + name +
                ", dog " + dog.name;
    }
}
