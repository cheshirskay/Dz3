package com.pvt.test.utill;

import java.util.Random;

public class GeneratingARandomAlphabeticStringUtill {

    public static String givenStudentName(int nameLength) {

        final int NUMBER_LETTER_A = 97;
        final int NUMBER_LETTER_Z = 122;
        final int NAME_LENGTH = nameLength;

        int leftLimit = NUMBER_LETTER_A;
        int rightLimit = NUMBER_LETTER_Z;
        int targetStringLength = NAME_LENGTH;

        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
