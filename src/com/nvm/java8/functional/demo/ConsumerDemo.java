package com.nvm.java8.functional.demo;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {
    /**
     * Performs this operation on the given argument.
     *
     * @param integer the input argument
     */
    @Override
    public void accept(Integer integer) {
        System.out.println("Integer passed: " + integer);
    }

    public static void main(String[] args) {
        ConsumerDemo consumer = new ConsumerDemo();
        consumer.accept(52);
    }
}
