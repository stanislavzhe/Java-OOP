package com.stas.JavaOOP.HomeWork.Lection2.BooksList;

/**
 * Created by stanislavz on 27-Jun-17.
 */
public class BookRunner {
    public static void main(String[] args) {
        Books books = addBooks();
        System.out.println(books);
        System.out.println("-----");

        String authorCheck = "Me";
        String publishingHouseCheck = "Own";
        int yearCheck = 1650;

        System.out.println("Author check:\n" + books.authorCheckList(authorCheck));
        System.out.println("-----");
        System.out.println("Publishing House check:\n" + books.publishingHouseCheckList(publishingHouseCheck));
        System.out.println("-----");
        System.out.println("Year check:\n" + books.yearCheckList(yearCheck));
    }

    private static Books addBooks() {
        Books books = new Books();
        //book1
        Book book1 = new Book("black and white");
        books.addtoList(book1);
        book1.setAuthor("Me");
        book1.setPublishingHouse("Own");
        book1.setYearOfPublishing(1599);
        book1.setNumberOfPages(851);
        book1.setPrice(1.99);
        book1.setTypeOfBinding("Book");
        //book2
        Book book2 = new Book("White");
        books.addtoList(book2);
        book2.setAuthor("Me");
        book2.setPublishingHouse("None");
        book2.setYearOfPublishing(1651);
        book2.setNumberOfPages(201);
        book2.setPrice(5.99);
        book2.setTypeOfBinding("Book");
        //book3
        Book book3 = new Book("Black");
        books.addtoList(book3);
        book3.setAuthor("King");
        book3.setPublishingHouse("Own");
        book3.setYearOfPublishing(1650);
        book3.setNumberOfPages(187);
        book3.setPrice(0.99);
        book3.setTypeOfBinding("Book");

        return books;
    }
}
