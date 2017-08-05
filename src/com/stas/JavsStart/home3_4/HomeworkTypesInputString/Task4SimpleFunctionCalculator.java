package com.stas.JavsStart.home3_4.HomeworkTypesInputString;

import java.util.Scanner;

/**
 * Created by stanislavz on 09-Mar-17.
 */
public class Task4SimpleFunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter x:" );
        double x = scanner.nextDouble();

        double sin = Math.sin(x);
        double exp = Math.exp(x);
        double pi = Math.PI;
        double sqrt = Math.sqrt(x);
        double f = Math.log(sin + + exp * sqrt / pi );

        System.out.println("f(x) = " + f);



    }
}
