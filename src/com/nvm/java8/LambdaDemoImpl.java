package com.nvm.java8;

interface LambdaDemo {
    void valid();
}

/**
 * updated with lambda usage.
 * ** no need of implementing the interface and overriding the abstract method
 * ** lambdas expressions can only be used for functional interfaces => having only one abstract method.
 * *** {any number of default/static methods allowed}.
 * ** syntax of lambda expr => () -> {body}
 */

public class LambdaDemoImpl {

    public static void main(String[] args) {
        // no argument lambda exp
        LambdaDemo lambda = () -> System.out.println("Yes, this option is valid");
        lambda.valid();
    }


}
