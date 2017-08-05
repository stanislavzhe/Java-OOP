package com.stas.JavaOOP.HomeWork.Lection1.Rectangle;

/**
 * Created by stanislavz on 26-Jun-17.
 */
public class RectangleRunner {
    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();
        Rectangle rectangle1 = new Rectangle(1,2);
        Rectangle rectangle2 = new Rectangle(3,4);
        Rectangle rectangle3 = new Rectangle(5,6);

        System.out.println("Perimeter of " + rectangle1 + " : " + rectangle1.getPerimeter());
        System.out.println("Square of " + rectangle1 + " : " + rectangle1.getSquare());

        rectangles.addtoList(rectangle1);
        rectangles.addtoList(rectangle2);
        rectangles.addtoList(rectangle3);

        System.out.println("-----");
        System.out.println("Sum of rectangles squares : " + rectangles.sumOfSquares());
    }
}
