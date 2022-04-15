package com.pvt.test.books;

import com.pvt.test.utill.ComparatorsBookUtill;

public class Book implements Comparable<Book> {

    private static final String ZERO_VALUE_STRING = "Not entered";
    private static final int ZERO_VALUE_INT = 0;
    private String authorNameBook;
    private String authorSurnameBook;
    private String authorPatronymicBook;
    private String nameBook;
    private int pagesBook;


    public Book() {
        this.authorNameBook = ZERO_VALUE_STRING;
        this.authorSurnameBook = ZERO_VALUE_STRING;
        this.authorPatronymicBook = ZERO_VALUE_STRING;
        this.nameBook = ZERO_VALUE_STRING;
        this.pagesBook = ZERO_VALUE_INT;
    }

    public Book(String authorNameBook, String authorSurnameBook, String authorPatronymicBook, String nameBook,
                int pagesBook) {

        this.authorNameBook = authorNameBook;
        this.authorSurnameBook = authorSurnameBook;
        this.authorPatronymicBook = authorPatronymicBook;
        this.nameBook = nameBook;
        this.pagesBook = pagesBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorNameBook() {
        return authorNameBook;
    }

    public void setAuthorNameBook(String authorNameBook) {
        this.authorNameBook = authorNameBook;
    }

    public String getAuthorSurnameBook() {
        return authorSurnameBook;
    }

    public void setAuthorSurnameBook(String authorSurnameBook) {
        this.authorSurnameBook = authorSurnameBook;
    }

    public String getAuthorPatronymicBook() {
        return authorPatronymicBook;
    }

    public void setAuthorPatronymicBook(String authorPatronymicBook) {
        this.authorPatronymicBook = authorPatronymicBook;
    }

    public int getPagesBook() {
        return pagesBook;
    }

    public void setPagesBook(int pagesBook) {
        this.pagesBook = pagesBook;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (pagesBook != book.pagesBook) return false;
        if (!authorNameBook.equals(book.authorNameBook)) return false;
        if (!authorSurnameBook.equals(book.authorSurnameBook)) return false;
        if (!authorPatronymicBook.equals(book.authorPatronymicBook)) return false;
        return nameBook.equals(book.nameBook);
    }

    @Override
    public int hashCode() {
        int result = authorNameBook.hashCode();
        result = 31 * result + authorSurnameBook.hashCode();
        result = 31 * result + authorPatronymicBook.hashCode();
        result = 31 * result + nameBook.hashCode();
        result = 31 * result + pagesBook;
        return result;
    }

    @Override
    public String toString() {

        return
                authorNameBook + " " + authorSurnameBook + " " + authorPatronymicBook + " - " + nameBook + " ( " +
                        pagesBook + " pages )";

    }

    @Override
    public int compareTo(Book o) {
        return ComparatorsBookUtill.comparatorNameBook.compare(this, o);
    }

}
