package com.stas.JavaOOP.HomeWork.Lection4.Train;

import java.util.Random;

/**
 * Created by stanislavz on 07-Jul-17.
 */
public class Runner {
    public static void main(String[] args) {
        Train train = new Train();
        System.out.println("Number of cars: " + findLength(train));
    }

    public static int findLength(Train train) {
        int trainLengthCoun = 1;

        train.printArray();
        System.out.println();
        train.lightOn();

        boolean end = false;
        while (!end) {
            train.turnRight();
            trainLengthCoun++;
            if (!train.isLightOn()) {
                continue;
            } else {
                train.lightOff();
                for (int i = 0; i < trainLengthCoun - 1; i++) {
                    train.turnLeft();
                }
                if (train.isLightOn()) {
                    for (int i = 0; i < trainLengthCoun - 1; i++) {
                        train.turnRight();
                    }
                    continue;
                } else {
                    trainLengthCoun--;
                    break;
                }
            }
        }
        return trainLengthCoun;
    }

}
