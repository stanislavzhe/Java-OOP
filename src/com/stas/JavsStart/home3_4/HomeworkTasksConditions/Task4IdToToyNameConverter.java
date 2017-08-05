package com.stas.JavsStart.home3_4.HomeworkTasksConditions;

import java.util.Scanner;

/**
 * Created by stanislavz on 10-Mar-17.
 */
public class Task4IdToToyNameConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter toy id: ");
        int toyId = scanner.nextInt();

        if (toyId == 0) {
            String toyName = "Car";
            System.out.print("You toy: " + toyName);
        }
        if (toyId == 1) {
            String toyName = "Lego";
            System.out.print("You toy: " + toyName);
        }
        if (toyId == 2) {
            String toyName = "Doll";
            System.out.print("You toy: " + toyName);
        }
        if (toyId == 3) {
            String toyName = "Puzzle";
            System.out.print("You toy: " + toyName);
        }
        if (toyId < 0 || toyId > 3) {
            throw new IllegalArgumentException("Toy id must be in the range [0..3], but actually is " + toyId);
        }
    }

}
