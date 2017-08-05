package com.stas.JavaOOP.HomeWork.Lection1.Rectangle;

import java.util.ArrayList;

/**
 * Created by stanislavz on 26-Jun-17.
 */
public class Rectangles {
    private final ArrayList<Rectangle> rectanglesList = new ArrayList<>();

    public void addtoList(Rectangle rectangle) {
        rectanglesList.add(rectangle);
    }

    public int sumOfSquares () {
        int sum = 0;
        for (Rectangle rectangle: rectanglesList) {
            sum += rectangle.getSquare();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Rectangles{" +
                "rectanglesList=" + rectanglesList +
                '}';
    }
}
