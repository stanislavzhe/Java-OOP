package com.stas.TasksForTraining;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by stanislavz on 04-Apr-17.
 * С помощью консоли пользователь вводит
 * математическое выражение типа “1+33-4*7”. Написать
 * программу для подсчета его значения. Приоритет
 * операций не учитывается.
 */
public class StringFormulaToMathResult {
    private static String formula;
    private static int result;

    public static void main(String[] args) {
        formula = formaulaInput();

        result = elementsMathResult(formula);
        System.out.println("Formula: " + formula + " = " + result);
    }

    private static int elementsMathResult(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            //first element value
            if (i == 0 && String.valueOf(s.charAt(i)).matches("[0-9]")) {
                String resultString = "";
                resultString += s.charAt(0);
                while (i != s.length() - 1 && String.valueOf(s.charAt(i + 1)).matches("[0-9]")) {
                    resultString += s.charAt(i + 1);
                    i++;
                }
                result += Integer.parseInt(resultString);
            }
            // +
            if (Objects.equals(s.charAt(i), '+')) {
                String resultString = "";
                while (i != s.length() - 1 && String.valueOf(s.charAt(i + 1)).matches("[0-9]")) {
                    resultString += s.charAt(i + 1);
                    i++;
                }
                result += Integer.parseInt(resultString);
            }
            // -
            if (Objects.equals(s.charAt(i), '-')) {
                String resultString = "";
                while (i != s.length() - 1 && String.valueOf(s.charAt(i + 1)).matches("[0-9]")) {
                    resultString += s.charAt(i + 1);
                    i++;
                }
                result -= Integer.parseInt(resultString);
            }
            // *
            if (Objects.equals(s.charAt(i), '*')) {
                String resultString = "";
                while (i != s.length() - 1 && String.valueOf(s.charAt(i + 1)).matches("[0-9]")) {
                    resultString += s.charAt(i + 1);
                    i++;
                }
                result *= Integer.parseInt(resultString);
            }
            // /
            if (Objects.equals(s.charAt(i), '/')) {
                String resultString = "";
                while (i != s.length() - 1 && String.valueOf(s.charAt(i + 1)).matches("[0-9]")) {
                    resultString += s.charAt(i + 1);
                    i++;
                }
                result /= Integer.parseInt(resultString);
            }
        }
        return result;
    }

    private static String formaulaInput() {
        String formula = "";

        Scanner scanner = new Scanner(System.in);

        while (formula.isEmpty()) {
            System.out.print("Enter math formula: ");
            formula = scanner.nextLine();

            for (int i = 0; i < formula.length(); i++) {
                // not symbols and space
                if (!String.valueOf(formula.charAt(i)).matches("[0-9+/*-]")) {
                    System.out.println("Formula contains letters or other non math symbols");
                    formula = "";
                    continue;
                }
                // not two math operators atonce
                if (i != formula.length() - 1 && String.valueOf(formula.charAt(i)).matches("[+*/-]") && String.valueOf(formula.charAt(i + 1)).matches("[+*/-]")) {
                    System.out.println("Two math operation symbols atonce");
                    formula = "";
                    continue;
                }
                // not operator last symbol
                if (String.valueOf(formula.charAt(i)).matches("[+*/-]") && i == formula.length() - 1) {
                    System.out.println("Math operation symbols last in formula");
                    formula = "";
                    continue;
                }
                // not operator first, exept + and -
                if (String.valueOf(formula.charAt(i)).matches("[*/]") && i == 0) {
                    System.out.println("Math operation symbols in the begining of the formula");
                    formula = "";
                }
            }
        }
        return formula;
    }
}