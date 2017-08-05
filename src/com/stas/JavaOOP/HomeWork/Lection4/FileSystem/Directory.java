package com.stas.JavaOOP.HomeWork.Lection4.FileSystem;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by stanislavz on 04-Jul-17.
 */
public class Directory implements Object {
    private String directoryName;
    private ArrayList<Object> files = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getName() {
        return directoryName;
    }

    public void addObjectToDirectory(Object object) {
        files.add(object);
    }

    public void addObjectsToDirectory(Object... objects) {
        for (Object object : objects) {
            this.files.add(object);
        }
    }

    @Override
    public double getSize() {
        double directorySize = 0;
        for (Object object : files) {
            directorySize += object.getSize();
        }
        return directorySize;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "directoryName='" + directoryName + '\'' +
                ", files=" + files +
                '}';
    }
}
