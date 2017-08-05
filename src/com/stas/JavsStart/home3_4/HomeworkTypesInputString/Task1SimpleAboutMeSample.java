package com.stas.JavsStart.home3_4.HomeworkTypesInputString;

import java.util.Scanner;

/**
 * Created by stanislavz on 09-Mar-17.
 */
public class Task1SimpleAboutMeSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your surname: ");
        String surname = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("I'm " + name + " " + surname + ", " + age + " years old");


    }
}
