package com.stas.JavaOOP.HomeWork.Lection3.Text;

/**
 * Created by stanislavz on 05-Jul-17.
 */
public class Word{
    private String word;

    Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return word;
    }
}
