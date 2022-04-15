package com.pvt.test.books;

public interface NameBookLibrary {
    int AMOUNT_OF_ELEMENTS_NAME_BOOK_LIBRARY = 10;
    String[] NAME_BOOK = new String[AMOUNT_OF_ELEMENTS_NAME_BOOK_LIBRARY];

    static String nameBookOut(int positionNameBook, String authorName) {
        if (authorName == "Alexander") {
            NAME_BOOK[0] = "The Captain’s Daughter";
            NAME_BOOK[1] = "Boris Godunov";
            NAME_BOOK[2] = "The Queen of Spades";
            NAME_BOOK[3] = "Eugene Onegin";
            NAME_BOOK[4] = "Pushkin's Fairy Tales";
            NAME_BOOK[5] = "Ruslan and Ludmila";
            NAME_BOOK[6] = "Vadim";
            NAME_BOOK[7] = "Bronze Horseman";
            NAME_BOOK[8] = "Tazit";
            NAME_BOOK[9] = "The Little House in Kolomna";
        } else if (authorName == "Nikolai") {
            NAME_BOOK[0] = "The Viy";
            NAME_BOOK[1] = "Taras Bulba";
            NAME_BOOK[2] = "Dead Souls";
            NAME_BOOK[3] = "The Nose";
            NAME_BOOK[4] = "The Overcoat";
            NAME_BOOK[5] = "Portrait";
            NAME_BOOK[6] = "Diary of a Madman";
            NAME_BOOK[7] = "Shinel";
            NAME_BOOK[8] = "May Night, or the Drowned Woman";
            NAME_BOOK[9] = "Old-world landowners";
        } else if (authorName == "Mikhail") {
            NAME_BOOK[0] = "A Hero of Our Time";
            NAME_BOOK[1] = "The Demon";
            NAME_BOOK[2] = "Borodino";
            NAME_BOOK[3] = "Song about Tsar Ivan Vasilyevich";
            NAME_BOOK[4] = "Mtsyri";
            NAME_BOOK[5] = "Masquerade";
            NAME_BOOK[6] = "Death of poet";
            NAME_BOOK[7] = "Prisoner of the Caucasus";
            NAME_BOOK[8] = "Cliff";
            NAME_BOOK[9] = "Sail";
        } else if (authorName == "Lev") {
            NAME_BOOK[0] = "ANNA KARENINA";
            NAME_BOOK[1] = "War and Peace";
            NAME_BOOK[2] = "Cossacks";
            NAME_BOOK[3] = "Adolescence";
            NAME_BOOK[4] = "Father Sergius";
            NAME_BOOK[5] = "Childhood";
            NAME_BOOK[6] = "Hadji Murad";
            NAME_BOOK[7] = "Sunday";
            NAME_BOOK[8] = "After the ball";
            NAME_BOOK[9] = "Two Old Men";
        } else if (authorName == "Anton") {
            NAME_BOOK[0] = "The Cherry Orchard";
            NAME_BOOK[1] = "Lady with a dog";
            NAME_BOOK[2] = "Kashtanka";
            NAME_BOOK[3] = "Gull";
            NAME_BOOK[4] = "Three sisters";
            NAME_BOOK[5] = "Uncle Ivan";
            NAME_BOOK[6] = "Roly";
            NAME_BOOK[7] = "Witch";
            NAME_BOOK[8] = "House with mezzanine";
            NAME_BOOK[9] = "Wife";
        } else {
            for (int i = 0; i < NAME_BOOK.length; i++) {
                NAME_BOOK[i] = "not found";
            }
        }
        return NAME_BOOK[positionNameBook];
    }


}
