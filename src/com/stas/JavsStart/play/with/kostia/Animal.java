package com.stas.JavsStart.play.with.kostia;

/**
 * Created by Stas on 12.03.2017.
 */
public abstract class Animal{
    private String name;
    private int age;

    public abstract void talk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            this.age = 0;
        }else {
            this.age = age;
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
