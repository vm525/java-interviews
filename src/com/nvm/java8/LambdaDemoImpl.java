package com.nvm.java8;

interface LambdaDemo {
    int subtract(int num1, int num2);
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
        // multi argument lambda exp with return type as well.
        // return & argument types are inferred by the compiler.
        LambdaDemo lambda = (num1, num2) -> num2 - num1;
        System.out.println(lambda.subtract(52, 74));
    }


}
