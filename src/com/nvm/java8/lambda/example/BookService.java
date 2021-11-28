package com.nvm.java8.lambda.example;

import java.util.Comparator;
import java.util.List;

//single line lambda expr in util sort method

public class BookService {

    public List<Book> getBooksInSortedOrder() {
        List<Book> books = new BookDAO().getBooks();
        books.sort((o1, o2) -> o2.getName().compareTo(o1.getName())); //reverse order
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSortedOrder());
    }
}