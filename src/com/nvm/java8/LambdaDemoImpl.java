package com.nvm.java8;

interface LambdaDemo {
    void echo(int arg);
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
        // single argument lambda exp
        LambdaDemo lambda = (arg) -> System.out.println("argument passed: " + arg);
        lambda.echo(52);
    }


}
