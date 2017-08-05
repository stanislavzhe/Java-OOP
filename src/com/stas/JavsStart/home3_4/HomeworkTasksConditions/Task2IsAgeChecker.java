package com.stas.JavsStart.home3_4.HomeworkTasksConditions;

import java.util.Scanner;

/**
 * Created by stanislavz on 10-Mar-17.
 */
public class Task2IsAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        boolean ageBoolean = age >= 1 && age <= 120;
        System.out.print("You age: " + ageBoolean);
    }
}
