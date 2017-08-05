package com.stas.JavaOOP.HomeWork.Lection3.Text;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

/**
 * Created by stanislavz on 05-Jul-17.
 */
public class Text {
    private Sentence title;
    private ArrayList <Sentence> textBody = new ArrayList<>();

    Text(Sentence title) {
        this.title = title;
    }

    public Text(Sentence title, Sentence sentence) {
        this.title = title;
        this.textBody.add(sentence);
    }

    public void addToText(Sentence sentence){
        textBody.add(sentence);
    }

    public void printText(){
        System.out.println("Text: ");
        for (Sentence sentence: textBody
                ) {
            System.out.print(sentence.toString());
        }
    }

    public void printTextTitle(){
        System.out.println("Title:\n"+ title);
    }

    @Override
    public String toString() {
        return "Text{" +
                "title=" + title +
                ", textBody=" + textBody +
                '}';
    }
}
