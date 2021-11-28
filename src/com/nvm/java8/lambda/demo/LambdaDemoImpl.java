package com.nvm.java8.lambda.demo;

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
        // argument types are inferred by the compiler.
        // multi-line lambda exp example. {Try to avoid these as much as possible}
        LambdaDemo lambda = (num1, num2) -> {
            if(num2 < num1) throw new ArithmeticException("num2 is less than num1");
            else return num2 - num1;
        };
        System.out.println(lambda.subtract(74, 52));
    }


}
