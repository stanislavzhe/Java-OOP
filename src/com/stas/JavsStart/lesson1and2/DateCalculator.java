package com.stas.JavsStart.lesson1and2;

/**
 * Created by stanislavz on 27-Feb-17.
 * 2. Написать программу переводящую количество дней в номера года, месяца, дня месяца. Предполагается, что год состоит из 360 дней, месяц из 30 дней.
 Input: days.
 Ouput: year, month, day.
 */
public class DateCalculator {
    public static void main(String[] args) {
        int days = 392;
        int year = 1;
        int month = 1;
        int day = 1;
        System.out.println("year = " + (year + ((days - 1) / 360)));
        System.out.println("month = " + (month + (((days - 1) % 360) / 30)));
        System.out.println("day = " + (day + (((days - 1) % 360) % 30)));

    }
}
