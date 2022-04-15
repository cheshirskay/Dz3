package com.pvt.test.utill;

import com.pvt.test.books.Book;

import java.util.Comparator;

public class ComparatorsBookUtill {

    public static Comparator<Book> comparatorNameBook = new Comparator<Book>() {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getNameBook().compareTo(o2.getNameBook());
        }
    };
    public static Comparator<Book> comparatorPagesBook = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getPagesBook() - o2.getPagesBook();
        }
    };
    public static Comparator<Book> comparatorAuthorNameBook = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthorNameBook().compareTo(o2.getAuthorNameBook());
        }
    };
    public static Comparator<Book> comparatorAuthorSurnameBook = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthorSurnameBook().compareTo(o2.getAuthorSurnameBook());
        }
    };
    public static Comparator<Book> comparatorauthorPatronymicBook = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthorPatronymicBook().compareTo(o2.getAuthorPatronymicBook());
        }
    };
}
