package com.stas.TasksForTraining.ClassesTest;

/**
 * Created by Stas on 16.07.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Creator creator = new Creator("Stas");
        Ob ob1 = creator.createOb("New",creator);
        System.out.println(ob1);

    }
}
