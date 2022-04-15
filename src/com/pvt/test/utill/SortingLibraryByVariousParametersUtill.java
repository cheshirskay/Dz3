package com.pvt.test.utill;

import com.pvt.test.books.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class SortingLibraryByVariousParametersUtill {

    public static void sortingLibrary(Collection<Book> list) {

        List sortedList = new ArrayList(list);

        System.out.print("\n\n\t\t by author's name  \n\n");
        Collections.sort(sortedList, ComparatorsBookUtill.comparatorAuthorNameBook);
        LibraryOutputUtill.libraryOut(sortedList);

        System.out.print("\n\n\t\t by author's surname  \n\n");
        Collections.sort(sortedList, ComparatorsBookUtill.comparatorAuthorSurnameBook);
        LibraryOutputUtill.libraryOut(sortedList);

        System.out.print("\n\n\t\t by book title  \n\n");
        Collections.sort(sortedList, ComparatorsBookUtill.comparatorNameBook);
        LibraryOutputUtill.libraryOut(sortedList);

        System.out.print("\n\n\t\t by number of pages  \n\n");
        Collections.sort(sortedList, ComparatorsBookUtill.comparatorPagesBook);
        LibraryOutputUtill.libraryOut(sortedList);

    }
}





