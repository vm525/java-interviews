package com.nvm.java8.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        // Supplier is used to supply/return a particular value using the `get` abstract method in the FI.
        // updated with lambda exp.
        Supplier<String> supplier = () -> "Hey, vm525!";

        // Awesome way we can use this FI, is for a fallback, in case we hit a condition which can't be met in any case.
        // findAny() method demo with Supplier as parameter.
        // list is blank => should fallback to the supplier return value from abstract method `get`.
        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(supplier));
    }
}
