package com.stas.JavaOOP.HomeWork.Lection2.ImmutablePointLine;

/**
 * Created by stanislavz on 27-Jun-17.
 */
public class Line {
    private final Point start;
    private final Point end;

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength () {
        return Math.sqrt(Math.pow(end.getX()- start.getX(), 2) + Math.pow(end.getY()- start.getY(), 2));
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
