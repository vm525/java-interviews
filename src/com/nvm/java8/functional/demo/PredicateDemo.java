package com.nvm.java8.functional.demo;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {

    public static void main(String[] args) {
        // Predicate FI is used for conditional check.
        // Awesome application is with stream, there is a util method => filter(), which has Predicate FI as method argument
        // Implicit Predicate demo using filter() with lambda exp
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.stream().filter(num -> num % 2 == 0).forEach(even -> System.out.println("printing even num: " + even));
    }
}
