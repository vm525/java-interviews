package com.nvm.java8.functional.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        //awesome thing is that, in streams, we have forEach method, which accepts Consumer FI as a parameter
        //forEach Consumer Demo
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        // directly passing the lambda expr here as forEach parameter.
        // underneath, its just a consumer FI, passing this `num` to the abstract `accept` method
        list.stream().forEach(num -> System.out.println("Integer passed: " + num)); //prints all the numbers present in the list.
    }
}
