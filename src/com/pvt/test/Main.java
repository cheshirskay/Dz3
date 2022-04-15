package com.pvt.test;

import com.pvt.test.books.Book;
import com.pvt.test.student.Student;
import com.pvt.test.utill.AddingDuplicatesBookUtill;
import com.pvt.test.utill.DeletingLibraryItemsUtill;
import com.pvt.test.utill.EvenAndOddStudents;
import com.pvt.test.utill.GenerationBookLibraryUtill;
import com.pvt.test.utill.GenerationStudentLibraryUtill;
import com.pvt.test.utill.LibraryOutputUtill;
import com.pvt.test.utill.OutputNameBookByVowelsUtill;
import com.pvt.test.utill.SortingLibraryByVariousParametersUtill;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {

        final int INDEX_REMOVE = 7;
        final int NUMBER_OF_BOOKS_TO_GENERATE_LIBRARY = 25;
        final int LENGTH_NAME_STUDENT_FOR_GENERATING = 9;

        LinkedList<Book> booksLinkedList = new LinkedList<>();

        System.out.print("\n\n\t\t Book Library LinkedList\n\n");
        GenerationBookLibraryUtill.bookLibraryGeneration(booksLinkedList, NUMBER_OF_BOOKS_TO_GENERATE_LIBRARY);
        LibraryOutputUtill.libraryOut(booksLinkedList);

        System.out.print("\n\n\t\t Book Library after removal \n\n");
        DeletingLibraryItemsUtill.deletingLibraryItem(booksLinkedList, INDEX_REMOVE);
        LibraryOutputUtill.libraryOut(booksLinkedList);

        System.out.print("\n\n\t\t Adding duplicates to LinkedList  \n\n");
        AddingDuplicatesBookUtill.addingDuplicatesBooks(booksLinkedList);
        LibraryOutputUtill.libraryOut(booksLinkedList);

        HashSet<Book> bookHashSet = new HashSet<>();

        System.out.print("\n\n\t\t Book Library bookHashSet  \n\n");
        GenerationBookLibraryUtill.bookLibraryGeneration(bookHashSet, NUMBER_OF_BOOKS_TO_GENERATE_LIBRARY);
        LibraryOutputUtill.libraryOut(bookHashSet);

        System.out.print("\n\n\t\t Adding duplicates to HashSet  \n\n");
        AddingDuplicatesBookUtill.addingDuplicatesBooks(bookHashSet);
        LibraryOutputUtill.libraryOut(bookHashSet);

        System.out.print("\n\n\t\t Sorting  ");
        SortingLibraryByVariousParametersUtill.sortingLibrary(bookHashSet);

        System.out.print("\n\n\t\t Displaying book titles starting with the first vowel  \n\n");
        OutputNameBookByVowelsUtill.outputLibrary(bookHashSet);

        TreeSet<Student> studentsTreeSet = new TreeSet<>();

        System.out.print("\n\n\t\t Student Library TreeSet  \n\n");
        GenerationStudentLibraryUtill.studentLibraryGeneration(studentsTreeSet, NUMBER_OF_BOOKS_TO_GENERATE_LIBRARY,
                LENGTH_NAME_STUDENT_FOR_GENERATING);
        LibraryOutputUtill.libraryOut(studentsTreeSet);

        System.out.print("\n\n\t\t Even students  \n\n");
        studentsTreeSet = EvenAndOddStudents.outputAndRemovalOfEvenAndOddStudents(studentsTreeSet);
        LibraryOutputUtill.libraryOut(studentsTreeSet);

    }
}
