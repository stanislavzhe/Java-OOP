package com.stas.JavaOOP.HomeWork.Lection2.ImmutablePointLine;

import java.util.ArrayList;

/**
 * Created by stanislavz on 27-Jun-17.
 */
public class Lines {
    private final ArrayList <Line> lines = new ArrayList<>();

    public void add(Line line) {
        lines.add(line);
    }

    public double sumLength() {
        double sumLength = 0;
        for (Line line: lines) {
            sumLength += line.getLength();
        }
        return sumLength;
    }

    public Line longestLine() {
        Line longestLine = lines.get(0);
        for (Line line: lines) {
            longestLine = (line.getLength() >= longestLine.getLength()) ? line : longestLine;
        }
        return longestLine;
    }
}
