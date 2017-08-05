package com.stas.JavaOOP.HomeWork.Lection3.Text;

/**
 * Created by stanislavz on 05-Jul-17.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста
 */
public class Main {
    public static void main(String[] args) {

        Word word = new Word("Hello");
        Sentence sentence = new Sentence(word);

        Text text = new Text(sentence);
        text.addToText(new Sentence(new Word("Hello")));
        text.addToText(new Sentence(new Word("World")));
        text.addToText(new Sentence(new Word("!!!")));


        text.printTextTitle();
        text.printText();
    }
}
