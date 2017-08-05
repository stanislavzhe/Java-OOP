package com.stas.JavaOOP.HomeWork.Lection7.Generics.Pair;

/**
 * Created by Stas on 19.07.2017.
 * Создать класс Pair<L, R>, хранящий пару значений (L left, R right).
 * Объекты класса Pair должны быть неизменяемые (Immutable).
 * Создать клиентский класс, демонстрирующий работу Pair.
 */
public class Pair <L,R>{
    private final L left;
    private final R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
