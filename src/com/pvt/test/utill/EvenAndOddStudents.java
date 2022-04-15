package com.pvt.test.utill;

import com.pvt.test.student.Student;

import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class EvenAndOddStudents {

   //method that removes an even student by id

    public static TreeSet<Student> outputAndRemovalOfEvenAndOddStudents(Collection<Student> list) {
        LinkedList<Student> sortList = new LinkedList(list);
        for (int i = 0; i < sortList.size(); ) {
            Student studentLine = sortList.get(i);
            int studentId = studentLine.getId();
            if (studentId % 2 != 0) {
                sortList.remove(i);
            } else {
                i++;
            }
        }
        return new TreeSet<>(sortList);
    }
}
