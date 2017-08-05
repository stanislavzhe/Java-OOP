package com.stas.JavaOOP.HomeWork.Lection2.ImmutablePointLine;

/**
 * Created by stanislavz on 27-Jun-17.
 */
public class Point {
    private final double x;
    private final double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
