package com.stas.TasksForTraining.ClassesTest;

/**
 * Created by Stas on 16.07.2017.
 */
public class Creator {
    private String name;

    public Creator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Ob createOb(String name, Creator creator){
        return new Ob(name, creator);
    }
}
