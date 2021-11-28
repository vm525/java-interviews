package com.nvm.java8.functional.demo;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param integer the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }

    public static void main(String[] args) {
        PredicateDemo predicate = new PredicateDemo();
        System.out.println("is num even: " + predicate.test(4));
    }
}
