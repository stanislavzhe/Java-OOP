package com.stas.JavaOOP.HomeWork.Lection7.Generics.Range;

/**
 * Created by Stas on 20.07.2017.
 * Создать класс Range<T extends Number & Comparable<T>> (возможно, используя класс Pair<L, R>).
 * Range применяется для хранения промежутка (например, Range<Integer>, Range<Long>).
 * Необходимо осуществлять проверки на корректность диапазона (нижняя граница должна быть не больше, чем верхняя).
 * Объекты класса Range должны быть неизменяемые (Immutable). Создать клиентский класс, демонстрирующий работу Range.
 */
public class Range <T extends Number & Comparable<T>>{
    private final T startRange;
    private final T endRange;

    public Range(T startRange, T endRange) {
        if (startRange.compareTo(endRange) > 0) {
            throw new IllegalArgumentException("Start of range bigger than end: " + startRange + " and " + endRange);
        }
        if (startRange.equals(endRange)) {
            throw new IllegalArgumentException("Start of range should not be same as end: " + startRange + " and " + endRange);
        }
        this.startRange = startRange;
        this.endRange = endRange;
    }

    public T getStartRange() {
        return startRange;
    }

    public T getEndRange() {
        return endRange;
    }

    @Override
    public String toString() {
        return "Range{" +
                "startRange=" + startRange +
                ", endRange=" + endRange +
                '}';
    }
}
