package com.stas.JavaOOP.HomeWork.Lection9.SetMap.HashMap_NumbersCounter;

import com.stas.JavaOOP.HomeWork.Lection4.FileSystem.Object;

import java.util.*;

/**
 * Created by stanislavz on 03-Aug-17.
 */
public class Runner {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,20,11,1,20,1,1,1,11,20,1);

        Map<Integer,Integer> listOfNumbers = new HashMap<>();

        int value;
        for (Integer number: list) {
            if (Objects.isNull(listOfNumbers.get(number))) {
                value = 1;
            }
            else {
                value = listOfNumbers.get(number) + 1;
            }
            listOfNumbers.put(number, value);
        }

        System.out.println(listOfNumbers);
    }
}
