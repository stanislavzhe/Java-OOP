package com.stas.JavaOOP.HomeWork.Lection2.ImmutablePointLine;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by stanislavz on 27-Jun-17.
 */
public class LinesRunner {
    public static void main(String[] args) {
        Lines lines = new Lines();

        Line line1 = new Line (new Point(1,2), new Point(3,4));
        Line line2 = new Line (new Point(-2,-2), new Point(-3,-3));
        Line line3 = new Line (new Point(10,2), new Point(13,4));

        System.out.println("Length of " + line1 + " : " + line1.getLength());

        lines.add(line1);
        lines.add(line2);
        lines.add(line3);

        System.out.println("-----");
        System.out.println("Sum  of lines lenght: " + lines.sumLength());
        System.out.println("Longest line: " + lines.longestLine() + "\nLongest line lenght: " + lines.longestLine().getLength());
    }
}
