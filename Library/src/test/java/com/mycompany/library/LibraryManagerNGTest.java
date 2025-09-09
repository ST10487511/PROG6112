/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.library;

/**
 *
 * @author RC_Student_lab
 */
public class LibraryManagerNGTest {

    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        // Test adding books
        manager.addBook("Harry Potter", "J.K. Rowling", "12345");
        manager.addBook("Lord of the Rings", "J.R.R. Tolkien", "67890");

        // Test display
        manager.displayBooks();

        // Test search
        System.out.println("\nSearching for 'Harry Potter':");
        manager.searchBook("Harry Potter"); // should find

        System.out.println("\nSearching for 'Unknown Book':");
        manager.searchBook("Unknown Book"); // should not find

        // Test getBook method (for automated assertions)
        assert manager.getBook("Harry Potter") != null;
        assert manager.getBook("Unknown Book") == null;
    }
}


