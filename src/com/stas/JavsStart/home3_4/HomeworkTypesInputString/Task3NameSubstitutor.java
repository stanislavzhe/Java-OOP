package com.stas.JavsStart.home3_4.HomeworkTypesInputString;

import java.util.Scanner;

/**
 * Created by stanislavz on 09-Mar-17.
 */
public class Task3NameSubstitutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        System.out.print("Enter name: ");
        String yourName = scanner.nextLine();

        message = message.replace("$(name)", yourName);

        System.out.println(message);


    }
}
