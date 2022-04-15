package com.pvt.test.utill;

import com.pvt.test.books.Book;

import java.util.Collection;
import java.util.ArrayList;

public class OutputNameBookByVowelsUtill {

    public static void outputLibrary(Collection<Book> list) {

        final int POSITION_OF_THE_FIRST_LETTER_OF_NAME_BOOK = 0;

        ArrayList<Book> sortList = new ArrayList(list);

        for (Book bookLine : sortList) {

            String bookLineNameBook = bookLine.getNameBook();

            char[] charsArray = bookLineNameBook.toCharArray();

            char[] ARRAY_OF_VOWELS = {'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'};

            for (char arrayOfVowel : ARRAY_OF_VOWELS) {
                if (charsArray[POSITION_OF_THE_FIRST_LETTER_OF_NAME_BOOK] == arrayOfVowel) {
                    System.out.println(bookLine);
                }
            }
        }
    }
}
