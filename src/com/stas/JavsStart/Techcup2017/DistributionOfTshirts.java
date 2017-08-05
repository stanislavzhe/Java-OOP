package com.stas.JavsStart.Techcup2017;

import java.util.Objects;

/**
 * Created by stanislavz on 19-Apr-17.
 * Распределение футболок
 * В качестве сувениров на соревновании по программированию было решено вручить футболки.
 * Всего в типографии были напечатаны футболки шести размеров: S, M, L, XL, XXL, XXXL (размеры перечислены в порядке возрастания).
 * Для каждого размера от S до XXXL вам известно количество футболок такого размера.
 * Во время регистрации организаторы попросили каждого из n участников указать размер футболки.
 * Если участник колебался между двумя размерами, то он мог указать два соседних — это означает, что ему подойдет футболка любого из двух размеров.
 * Напишите программу, которая определит, возможно ли из напечатанных в типографии футболок сделать подарок каждому участнику соревнования.
 * Конечно, каждому участнику должна достаться футболка его размера: требуемого размера, если указан один размер; любого из двух размеров, если указаны два соседних размера.
 * В случае положительного ответа программа должна найти любой из вариантов раздачи футболок.
 */
public class DistributionOfTshirts {
    public static void main(String[] args) {
        String[] size = {"S", "M", "L"};
        int[] sizeAmount = {3, 2, 1};

        String[] membersSizes = {"SM", "SM", "ML", "S", "M", "L"};
        System.out.print("Members size list: ");
        for (String element : membersSizes
                ) {
            System.out.print(element + "; ");
        }
        System.out.println();

        // number of size were no split
        for (String elementSize : size) {
            int countsSize = 0;
            for (String element : membersSizes) {
                if (Objects.equals(element, elementSize)) {
                    countsSize++;
                }
            }
            System.out.println(elementSize + ": " + countsSize);
        }
        System.out.println();

        // number of size with split
        for (int i = 0; i < size.length - 1; i++) {
            int countSplitSize = 0;
            for (String element : membersSizes) {
                if (element.contains(size[i]) && element.contains(size[i + 1])) {
                    countSplitSize++;
                }
            }
            System.out.println(size[i] + size[i + 1] + ": " + countSplitSize);
            if (countSplitSize == (sizeAmount[i] + sizeAmount[i + 1])) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
