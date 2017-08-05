package com.stas.JavaOOP.HomeWork.Lection1.Months;

import java.util.Scanner;

/**
 * Created by Stas on 28.06.2017.
 */
public class Months {
    public static void main(String[] args) {
        System.out.println("Enter month number: ");
        int value = enterMonthNumber();
        String monthString;
        switch (value) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Wrong month";
                break;
        }
        System.out.println(monthString + " " + value + " month");
    }

    public static int enterMonthNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.print("Illegal value, try again: \n>>");
        }

        int value = scanner.nextInt();
        if (value < 0 || value > 12) {
            System.out.print("Illegal value, try again: \n>>");
            value = enterMonthNumber();
        }

        return value;
    }
}
