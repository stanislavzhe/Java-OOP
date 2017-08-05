package com.stas.JavaOOP.HomeWork.Lection1.Rectangle;

/**
 * Created by stanislavz on 26-Jun-17.
 */
public class Rectangle {
    private final int length;
    private final int height;

    public Rectangle(int length, int height) {
        if (length <= 0) {
            throw new IllegalArgumentException("length <= 0: " + length);
        }
        if (height <= 0) {
            throw new IllegalArgumentException("height <= 0: " + height);
        }
        this.length = length;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }

    public int getPerimeter() {
        return 2*(length + height);
    }

    public int getSquare() {
        return length * height;
    }
}
