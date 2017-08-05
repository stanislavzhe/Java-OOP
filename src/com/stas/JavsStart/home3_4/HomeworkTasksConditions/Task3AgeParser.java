package com.stas.JavsStart.home3_4.HomeworkTasksConditions;

import java.util.Scanner;

/**
 * Created by stanislavz on 10-Mar-17.
 */
public class Task3AgeParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your age: ");
        String age = scanner.next();
        int ageInt = Integer.parseInt(age);
        boolean ageBoolean = ageInt >= 1 && ageInt <= 120;

        // Input validation
        if (!ageBoolean) {
            throw new IllegalArgumentException("Age must be in the range [1..120], but actually is " + ageInt);
        }

        System.out.print("You age: " + ageInt);

    }
}
