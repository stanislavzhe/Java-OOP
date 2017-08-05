package com.stas.JavsStart.home3_4.HomeworkTypesInputString;

import java.util.Scanner;

/**
 * Created by stanislavz on 09-Mar-17.
 */
public class Task2DifferentRadixSummator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter X in Bin: ");
        int xBin = scanner.nextInt(2);

        System.out.print("Enter Y in Oct: ");
        int yOct = scanner.nextInt(8);

        System.out.print("Enter Z in Hex: ");
        int zHex = scanner.nextInt(16);

        System.out.println("X + Y + Z = " + (xBin + yOct + zHex));
    }
}
