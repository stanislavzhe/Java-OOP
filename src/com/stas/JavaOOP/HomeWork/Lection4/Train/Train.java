package com.stas.JavaOOP.HomeWork.Lection4.Train;

import java.util.Objects;
import java.util.Random;

/**
 * Created by stanislavz on 06-Jul-17.
 */
public class Train implements Itrain {
    private int numberOfCars;
    private boolean [] array;

    private int currentPosition = 0;


    Train() {
        numberOfCars = (int) (Math.random() * 10) + 1;
        array = new boolean [numberOfCars];
        fillLightArray();
    }

    Train(boolean [] array) {
        numberOfCars = (int) (Math.random() * 10);
        array = new boolean [numberOfCars];
        this.array = array;
    }

    Train(int numberOfCars, boolean [] array) {
        this.numberOfCars = numberOfCars;
        this.array = array;
    }

    @Override
    public void turnLeft() {
        if (currentPosition == 0) {
            currentPosition = array.length - 1;
        }
        else {
            currentPosition--;
        }
    }

    @Override
    public void turnRight() {
        if (currentPosition == array.length - 1) {
            currentPosition = 0;
        }
        else {
            currentPosition++;
        }
    }

    @Override
    public void lightOn() {
        array[currentPosition] = true;
    }

    @Override
    public void lightOff() {
        array[currentPosition] = false;

    }

    @Override
    public boolean isLightOn() {
        return array[currentPosition];
    }

    @Override
    public boolean isLength(int expectedLength) {
        return (Objects.equals(expectedLength, numberOfCars));
    }

    private void fillLightArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextBoolean();
        }
    }

    public void printArray(){
        System.out.println("Light array ");
        for (boolean light: array) {
            System.out.println(light);
        }
    }
}
