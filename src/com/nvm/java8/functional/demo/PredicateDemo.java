package com.nvm.java8.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        // Predicate FI is used for conditional check.
        Predicate<Integer> predicate = num -> num % 2 == 0;
        System.out.println("is num even: " + predicate.test(7));

        // Awesome application is with stream, there is a util method => filter(), which has Predicate FI as method argument
        // Predicate demo using filter()
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.stream().filter(predicate).forEach(even -> System.out.println("printing even num: " + even));
    }
}
