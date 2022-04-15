package com.pvt.test.utill;

import java.util.List;

public class DeletingLibraryItemsUtill {
    static final int DELETION_LIMIT = 1;

    public static <T> void deletingLibraryItem(List<T> list, int index) {
        if (list == null || list.size() <= DELETION_LIMIT || list.size() <= index) {
            System.out.print("element not removed !!!! \n\n");
            return;
        }
        list.remove(index);
    }
}
