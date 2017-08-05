package com.stas.JavsStart.home3_4.HomeworkTasksConditions;

import java.util.Scanner;

/**
 * Created by stanislavz on 10-Mar-17.
 */
public class Task5ToyNameToIdConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter toy name: ");
        String toyName = scanner.next();

        int toyId;
        switch (toyName) {
            case "Car":
            case "car":
                toyId = 0;
                System.out.println("Toy id: " + toyId);
                break;
            case "Lego":
            case "lego":
                toyId = 1;
                System.out.println("Toy id: " + toyId);
                break;
            case "Doll":
            case "doll":
                toyId = 2;
                System.out.println("Toy id: " + toyId);
                break;
            case "Puzzle":
            case "puzzle":
                toyId = 3;
                System.out.println("Toy id: " + toyId);
                break;
            default:
                throw new IllegalArgumentException("Toy name must be in the scope [Car, Lego, Doll, Puzzle], but actually is " + toyName);


        }
    }
}
