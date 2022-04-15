package com.pvt.test.utill;

import com.pvt.test.student.Student;

import java.util.Collection;

public class GenerationStudentLibraryUtill {
    public static void studentLibraryGeneration(Collection<Student> list, int value, int nameLength) {

        final int CONSTANT_FOR_GENERATING_STUDENT_TOTAL_SCORE = 1000;
        final int CONSTANT_FOR_GENERATING_STUDENT_ID = 100000;
        int idStudent;
        String nameStudent;
        int totalScoreStudent;

        for (int i = 1; i <= value; i++) {

            idStudent = (int) (Math.random() * CONSTANT_FOR_GENERATING_STUDENT_ID);
            nameStudent = GeneratingARandomAlphabeticStringUtill.givenStudentName(nameLength);
            totalScoreStudent = (int) (Math.random() * CONSTANT_FOR_GENERATING_STUDENT_TOTAL_SCORE);

            list.add(new Student(idStudent, nameStudent, totalScoreStudent));
        }
    }
}
