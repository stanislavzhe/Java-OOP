package com.stas.JavaOOP.HomeWork.Lection3.Computer;

/**
 * Created by stanislavz on 05-Jul-17.
 */
public class Processor {
    private String model;
    private double frequency;

    public Processor(String model, double frequency) {
        if (frequency <= 0) {
            throw new IllegalArgumentException("CPU frequency <= 0" + frequency);
        }
        this.model = model;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public double getFrequency() {
        return frequency;
    }
}
