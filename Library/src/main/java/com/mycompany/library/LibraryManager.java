/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;
import java.util.ArrayList;

/**
 *
 * @author RC_Student_lab
 */
public class LibraryManager {
    private ArrayList<Book> books = new ArrayList<>();

    // Add a book
    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
        System.out.println("Book added successfully!");
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("\n--- Library Books ---");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Search for a book by title
    public void searchBook(String searchTitle) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // For automated testing: return the book object if found
    public Book getBook(String searchTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                return book;
            }
        }
        return null;
    }

}


