package com.pvt.test.utill;

import com.pvt.test.books.AuthorNameBookLibrary;
import com.pvt.test.books.Book;
import com.pvt.test.books.NameBookLibrary;

import java.util.Collection;

public class GenerationBookLibraryUtill {

    public static void bookLibraryGeneration(Collection<Book> list, int value) {
        final int CONSTANT_FOR_GENERATING_BOOK_PAGES = 1000;
        String authorNameBooks;
        String authorSurnameBooks;
        String authorPatronymicBooks;
        String nameBooks;
        int pagesBook;

        for (int i = 0; i < value; i++) {
            authorNameBooks = AuthorNameBookLibrary.authorNameBookOut((int)
                    (Math.random() * AuthorNameBookLibrary.AUTHOR_NAME_LIBRARY.length));

            if (authorNameBooks == "Alexander") {
                authorSurnameBooks = "Pushkin";
                authorPatronymicBooks = "Sergeyevich";
            } else if (authorNameBooks == "Nikolai") {
                authorSurnameBooks = "Gogol";
                authorPatronymicBooks = "Vasilievich";
            } else if (authorNameBooks == "Mikhail") {
                authorSurnameBooks = "Lermontov";
                authorPatronymicBooks = "Yuryevich";
            } else if (authorNameBooks == "Lev") {
                authorSurnameBooks = "Tolstoy";
                authorPatronymicBooks = "Nikolaevich";
            } else if (authorNameBooks == "Anton") {
                authorSurnameBooks = "Chekhov";
                authorPatronymicBooks = "Pavlovich";
            } else {
                authorSurnameBooks = "not found";
                authorPatronymicBooks = "not found";
            }
            nameBooks = NameBookLibrary.nameBookOut((int)
                    (Math.random() * NameBookLibrary.NAME_BOOK.length), authorNameBooks);
            pagesBook = (int) (Math.random() * CONSTANT_FOR_GENERATING_BOOK_PAGES);

            list.add(new Book(authorNameBooks, authorSurnameBooks, authorPatronymicBooks, nameBooks, pagesBook));
        }

    }

}
