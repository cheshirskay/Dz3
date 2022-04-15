package com.pvt.test.utill;

import java.util.Collection;

public class LibraryOutputUtill {

    public static <T> void libraryOut(Collection<T> list) {
        int position = 0;
        for (T t : list) {
            position++;
            System.out.print(position + "\t ");
            System.out.println(t);
        }
    }
}
