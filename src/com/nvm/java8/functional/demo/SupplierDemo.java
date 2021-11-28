package com.nvm.java8.functional.demo;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {
    /**
     * Gets a result.
     *
     * @return a result
     */
    @Override
    public String get() {
        return "Hey, vm525!";
    }

    public static void main(String[] args) {
        // Supplier is used to supply/return a particular value using the `get` abstract method in the FI.
        // Traditional demo
        Supplier<String> supplier = new SupplierDemo();
        System.out.println(supplier.get());
    }
}
