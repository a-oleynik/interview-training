package com.oleynik.interviewtraining.lesson3.homework.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    final private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book search(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public String getLibraryInfo() {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.getBookInfo()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Book1", "Author1", 2020, true);
        Book book2 = new Book("Book2", "Author2", 2021, true);
        Book book3 = new Book("Book3", "Author3", 2022, true);
        book2.borrowBook();
        book3.borrowBook();
        book3.returnBook();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("Books in library:");
        System.out.println(library.getLibraryInfo());
        System.out.println("Search for Book2:");
        System.out.println(library.search("Book2"));
        System.out.println("");
        System.out.println("Removing Book2:");
        library.removeBook(book2);
        System.out.println("Books in library:");
        System.out.println(library.getLibraryInfo());

        library.removeBook(book2);
        System.out.println("Books in library:");
        System.out.println(library.getLibraryInfo());
    }

}
