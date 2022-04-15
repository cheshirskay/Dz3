package com.pvt.test.books;

public interface AuthorNameBookLibrary {
    String[] AUTHOR_NAME_LIBRARY = {"Alexander", "Nikolai", "Mikhail", "Lev", "Anton"};

    static String authorNameBookOut(int positionAuthor) {
        return AUTHOR_NAME_LIBRARY[positionAuthor];
    }

}
