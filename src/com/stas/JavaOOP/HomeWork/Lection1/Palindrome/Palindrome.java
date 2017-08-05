package com.stas.JavaOOP.HomeWork.Lection1.Palindrome;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by stanislavz on 27-Jun-17.
 * Ввести N чисел с консоли. Среди чисел найти число-палиндром.
 * Если таких чисел больше одного,  найти второе.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter n, number of values: ");
        int n = enterNumber();
        int [] numbersArray = valuesEnter(n);
        palindromeCheckResult(numbersArray);
    }

    public static int[] valuesEnter (int n) {
        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value " + (i + 1));
            array[i] = enterNumber();
        }
        return array;
    }

    public static void palindromeCheckResult(int [] array) {
        int twoPalindrome = 0;
        for (int element: array) {
            System.out.println(element + " is palindrome: " +  arrayContainsPalindrome(numberToArray(element)));
            if (arrayContainsPalindrome(numberToArray(element))) {
                twoPalindrome++;
            }
            if (twoPalindrome == 2) {
                System.out.println("Two Palindrome was found!");
                break;
            }
        }
    }

    public static int enterNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.print("Illegal value, try again: \n>>");
        }
        return scanner.nextInt();
    }

    public static int numberOfSigns(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] numberToArray(int number){
        int[] array = new int[numberOfSigns(number)];

        for (int i = numberOfSigns(number) - 1; i >= 0; i--) {
            array[i] = number % (int) Math.pow(10,numberOfSigns(number) - i);
            //System.out.println(i + ": " + array[i]);
            number /= 10;
        }
        return array;
    }

    public static boolean arrayContainsPalindrome(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            if (!Objects.equals(array[i], array[array.length - 1 - i])) {
                //System.out.println("Elements NOT same " + array[i] + " and " + array[array.length - 1 - i]);
                return false;
            }
        }
        return true;
    }
}
