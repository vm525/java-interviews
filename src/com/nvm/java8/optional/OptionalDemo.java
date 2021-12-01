package com.nvm.java8.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Customer customer = new Customer(1234, "Vibhor", null, Arrays.asList("945678345", "5667875443"));

        System.out.println("email: " + customer.getEmail());

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println("empty optional: " + emptyOptional);
        // `of` method always expects the object parameter passed to be non-null.
        // Internally calls requireNonNull method to ensure the non nullity
        System.out.println("email optional via of: " + Optional.of(customer.getEmail())); // throws null pointer exception
        System.out.println("email optional via ofNullable: " + Optional.ofNullable(customer.getEmail()));

    }
}
