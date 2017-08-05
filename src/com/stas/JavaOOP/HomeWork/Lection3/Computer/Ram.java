package com.stas.JavaOOP.HomeWork.Lection3.Computer;

/**
 * Created by stanislavz on 05-Jul-17.
 */
public class Ram {
    private String ramModel;
    private int ramSize;

    public Ram(String ramModel, int ramSize) {
        if (ramSize <= 0) {
            throw new IllegalArgumentException("ramSize <= 0" + ramSize);
        }
        this.ramModel = ramModel;
        this.ramSize = ramSize;
    }

    public String getRamModel() {
        return ramModel;
    }

    public int getRamSize() {
        return ramSize;
    }
}
