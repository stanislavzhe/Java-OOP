package com.stas.JavsStart.home3_4.HomeworkTypesInputString;

import java.util.Scanner;

/**
 * Created by stanislavz on 09-Mar-17.
 */
public class Task2DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X in Bin: ");
        String x = scanner.next();

        System.out.print("Enter Y in Oct: ");
        String y = scanner.next();

        System.out.print("Enter Z in Hex: ");
        String z = scanner.next();

        int xBin = Integer.parseInt(x,2);
        int yOct = Integer.parseInt(y,8);
        int zHex = Integer.parseInt(z,16);


        int sum = xBin + yOct + zHex;
        System.out.println("X + Y + Z = " + sum);


    }
}
