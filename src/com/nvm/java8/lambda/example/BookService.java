package com.nvm.java8.lambda.example;

import java.util.Comparator;
import java.util.List;

//traditional way of using implementing Comparator via a class and using the same in util sort method

public class BookService {

    public List<Book> getBooksInSortedOrder() {
        List<Book> books = new BookDAO().getBooks();
        books.sort(new BookNameComparator());
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSortedOrder());
    }
}


class BookNameComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getName().compareTo(o1.getName()); //reverse order
    }
}
