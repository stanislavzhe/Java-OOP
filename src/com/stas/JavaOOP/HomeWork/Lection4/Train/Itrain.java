package com.stas.JavaOOP.HomeWork.Lection4.Train;

/**
 * Created by stanislavz on 07-Jul-17.
 */
public interface Itrain {
    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);
}
