package com.stas.JavaOOP.Project;

/**
 * Created by Stas on 06.07.2017.
 */
public class Comment {
    private String text;
    private final User author;

    public Comment(String text, User author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public User getAuthor() {
        return author;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", author=" + author +
                '}';
    }
}
