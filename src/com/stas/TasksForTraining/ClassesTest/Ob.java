package com.stas.TasksForTraining.ClassesTest;

/**
 * Created by Stas on 16.07.2017.
 */
public class Ob {
    private String name;
    private Creator creator;

    public Ob(String name, Creator creator) {
        this.name = name;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public Creator getCreator() {
        return creator;
    }

    @Override
    public String toString() {
        return "Ob{" +
                "name='" + name + '\'' +
                ", creator=" + creator +
                '}';
    }
}
