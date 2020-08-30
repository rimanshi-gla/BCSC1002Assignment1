/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc22011)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.*;

public class Library {
    private static final int MAXIMUM_BOOKS_IN_LIBRARY = 5;
    private Book[] booksThatAreCurrentlyAvailable;

    public Library(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    public Library() {
        this.booksThatAreCurrentlyAvailable = new Book[MAXIMUM_BOOKS_IN_LIBRARY];
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_BOOKS_IN_LIBRARY; libraryIndex++) {
            this.booksThatAreCurrentlyAvailable[libraryIndex] = new Book();
        }
    }

    public Book[] getBooksThatAreCurrentlyAvailable() {
        return booksThatAreCurrentlyAvailable;
    }

    public void setBooksThatAreCurrentlyAvailable(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    @Override
    public String toString() {
        return Arrays.toString(booksThatAreCurrentlyAvailable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksThatAreCurrentlyAvailable(), library.getBooksThatAreCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksThatAreCurrentlyAvailable());
    }

    public void setBooksInLibrary() {
        booksThatAreCurrentlyAvailable[0].setNameOfTheBook("Engineering Mathematics");
        booksThatAreCurrentlyAvailable[0].setNameOfTheAuthorOfTheBook("H. K. Das");
        booksThatAreCurrentlyAvailable[0].setThirteenDigitISBNNumberOfTheBook("9352836537000");
        booksThatAreCurrentlyAvailable[1].setNameOfTheBook("Digital Electronics");
        booksThatAreCurrentlyAvailable[1].setNameOfTheAuthorOfTheBook("M. Mano");
        booksThatAreCurrentlyAvailable[1].setThirteenDigitISBNNumberOfTheBook("9353062012000");
        booksThatAreCurrentlyAvailable[2].setNameOfTheBook("Database Management System");
        booksThatAreCurrentlyAvailable[2].setNameOfTheAuthorOfTheBook("Navathe");
        booksThatAreCurrentlyAvailable[2].setThirteenDigitISBNNumberOfTheBook("9789332582705");
        booksThatAreCurrentlyAvailable[3].setNameOfTheBook("Fundamental of Software Engineering");
        booksThatAreCurrentlyAvailable[3].setNameOfTheAuthorOfTheBook("Rajib Mall");
        booksThatAreCurrentlyAvailable[3].setThirteenDigitISBNNumberOfTheBook("9789388028028");
        booksThatAreCurrentlyAvailable[4].setNameOfTheBook("Core JAVA");
        booksThatAreCurrentlyAvailable[4].setNameOfTheAuthorOfTheBook("Dr. R. Nageswara Rao");
        booksThatAreCurrentlyAvailable[4].setThirteenDigitISBNNumberOfTheBook("9351199258111");
    }
    
    public void showAvailableBooks() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("|%-36s %-21s %-21s|\n", "Book Name", "Author Name", "13-Digit ISBN Number");
        System.out.println("----------------------------------------------------------------------------------");
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_BOOKS_IN_LIBRARY; libraryIndex++) {
            System.out.printf("|%-36s %-21s %-21s|\n", booksThatAreCurrentlyAvailable[libraryIndex].getNameOfTheBook(), booksThatAreCurrentlyAvailable[libraryIndex].getNameOfTheAuthorOfTheBook(), booksThatAreCurrentlyAvailable[libraryIndex].getThirteenDigitISBNNumberOfTheBook());
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
}



