package com.nvm.java8.functional.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        // same thing as before, but using lambda exp.
        Consumer<Integer> consumer = num -> System.out.println("Integer passed: " + num);
        consumer.accept(52);

        //awesome thing is that, in streams, we have forEach method, which accepts Consumer FI as a parameter
        //forEach Consumer Demo
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        // using the same consumer here from above.
        list.stream().forEach(consumer); //prints all the numbers present in the list.
    }
}
