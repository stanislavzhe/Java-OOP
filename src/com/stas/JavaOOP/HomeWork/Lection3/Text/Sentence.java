package com.stas.JavaOOP.HomeWork.Lection3.Text;

import java.util.ArrayList;

/**
 * Created by stanislavz on 05-Jul-17.
 */
public class Sentence {
    private ArrayList<Word> words = new ArrayList<>();

    Sentence(Word word) {
        this.words.add(word);
    }

    public void addToSentence(Word word) {
        this.words.add(word);
    }

    @Override
    public String toString() {
        String result = "";
        for (Word word: words
             ) {
            result = result.concat(word.toString()+ " ");
        }
        return result;
    }
}
