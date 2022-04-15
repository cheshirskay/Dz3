package com.pvt.test.utill;

import com.pvt.test.books.Book;

import java.util.Collection;

public class AddingDuplicatesBookUtill {
    static final int NUMBER_OF_DUPLICATES = 6;

    public static void addingDuplicatesBooks(Collection<Book> list) {

        for (int i = 1; i <= NUMBER_OF_DUPLICATES; i++) {

            list.add(new Book("Mikhail", "Bulgakov",
                    "Afanasyevich", "The Master and Margarita", 616));
            System.out.println("book duplicate added - " + i + " times");
        }
        System.out.println("\n Size " + list.size() + "\n");
    }
}
