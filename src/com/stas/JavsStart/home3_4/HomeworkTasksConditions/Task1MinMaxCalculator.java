package com.stas.JavsStart.home3_4.HomeworkTasksConditions;

import java.util.Scanner;

/**
 * Created by stanislavz on 10-Mar-17.
 */
public class Task1MinMaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        int max, min;
        if (a > b){
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }

}
