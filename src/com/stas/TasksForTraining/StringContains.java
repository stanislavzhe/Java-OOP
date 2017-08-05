package com.stas.TasksForTraining;

import java.util.Scanner;

/**
 * Created by stanislavz on 31-Mar-17.
 */
public class StringContains {
    static int mayBe = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = "";
        while (result == "") {
            System.out.print("Enter element position ID where you want to set mark, ID = ");
            String textFromConsole = scanner.nextLine();

            for (int i = 0; i < textFromConsole.length(); i++) {
                for (int j = 0; j < 10; j++) {
                    if (textFromConsole.charAt(i) == Integer.toString(j).charAt(0)) {
                        result = result + Integer.toString(j).charAt(0);
                    }
                }
            }
            // no numbers/only symbols
            if (result == "") {
                System.out.println("You enter wrong elemnt ID");
            }
            // numbers not in range
            if (result != "") {
                int resultInt = Integer.valueOf(result);
                if (resultInt < 0 || resultInt > 8) {
                    System.out.println("You enter elemnt ID not in range");
                    result = "";
                }
            }
        }
//        int idFromKeyboard = Integer.valueOf(result);
//        System.out.println(idFromKeyboard);
//
//        String inputElementID = Integer.toString(idFromKeyboard, 3); // from id 0-8 to id 00-22
//        int inputElementIDInt = Integer.valueOf(inputElementID); // string to int
//        System.out.println(inputElementIDInt);

        System.out.println(mayBe);
        mayBe ++;
        System.out.println(mayBe);

        // need check for mark exist
    }
}
