package Library_Management_System;

import java.util.Arrays;
import java.util.List;

public class TestLibraryManagementSystem {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(1, "The Love Hypothesis", "Ali Hazelwood"),
                new Book(2, "BTTW", "Lynn Painter"),
                new Book(3, "1984", "George Orwell"),
                new Book(4, "Half GirlFriend", "Chetan Bhagat"),
                new Book(5, "The Catcher in the Rye", "J.D. Salinger")
        );

        LibraryManagementSystem lms = new LibraryManagementSystem();

        // Test Linear Search
        Book book1 = lms.linearSearchByTitle(books, "BTTW");
        System.out.println(book1);

        // Assuming the list is sorted
        books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        // Test Binary Search
        Book book2 = lms.binarySearchByTitle(books, "BTTW");
        System.out.println(book2);
    }
}

