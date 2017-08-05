package com.stas.JavaOOP.HomeWork.Lection2.BooksList;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by stanislavz on 27-Jun-17.
 */
public class Books {
    ArrayList <Book> books = new ArrayList<>();

    public void addtoList (Book book) {
        books.add(book);
    }

    public Books authorCheckList(String author){
        Books authorBooks = new Books();
        for (Book book: books) {
            if (Objects.equals(book.getAuthor(),author)) {
                authorBooks.addtoList(book);
            }
        }
        return authorBooks;
    }

    public Books publishingHouseCheckList(String publishingHouse){
        Books publishingHouseBooks = new Books();
        for (Book book: books) {
            if (Objects.equals(book.getPublishingHouse(),publishingHouse)) {
                publishingHouseBooks.addtoList(book);
            }
        }
        return publishingHouseBooks;
    }

    public Books yearCheckList(int year){
        Books publishingHouseBooks = new Books();
        for (Book book: books) {
            if (book.getYearOfPublishing() >= year) {
                publishingHouseBooks.addtoList(book);
            }
        }
        return publishingHouseBooks;
    }

    @Override
    public String toString() {
        return "List: " +
                "books=" + books +
                '}';
    }
}
