package com.stas.JavsStart.Techcup2017;

/**
 * Created by stanislavz on 13-Apr-17.
 * Превращение: из A в B
 * У Василия есть число a, которое он хочет превратить в число b. Для этого он может производить два типа операций:
 * умножить имеющееся у него число на 2 (то есть заменить число x числом 2·x);
 * приписать к имеющемуся у него числу цифру 1 справа (то есть заменить число x числом 10·x + 1).
 * Вам надо помочь Василию получить из числа a число b с помощью описанных операций, либо сообщить, что это невозможно.
 * Обратите внимание, что в этой задаче не требуется минимизировать количество операций. Достаточно найти любой из способов получить из числа a число b.
 */
public class AToBConvert {
    public static void main(String[] args) {
        int a = 3;
        int b = 62;
        System.out.println("A:" + a + "; B: " + b);
        int result;
        result = b;

        while (result != a) {
            if (result % 10 == 1) {
                result = nonFractionalPartDivisionByTen(result);
                if (numbersEquals(a, result)) {
                    System.out.println("You could transform A to B");
                    break;
                }
                continue;
            }
            if (result % 2 == 0) {
                result = divisionByTwo(result);
                if (numbersEquals(a, result)) {
                    System.out.println("You could transform A to B");
                    break;
                }
                continue;
            }
            else {
                System.out.println("You could NOT transform A to B");
                break;
            }
        }
    }

    private static boolean numbersEquals(int a, int b) {
        return a == b;
    }

    private static int divisionByTwo(int number) {
        return number / 2;
    }

    private static int nonFractionalPartDivisionByTen(int number) {
        return (number / 10);
    }

    private static int getCountOfGigits(int number) {
        int tenCounter = (number == 0) ? 1 : 0;
        while (number != 0) {
            tenCounter++;
            number /= 10;
        }
        return tenCounter;
    }


}
