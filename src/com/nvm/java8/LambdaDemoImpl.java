package com.nvm.java8;

interface LambdaDemo {
    void valid();
}

// shows the traditional way of implementing an interface and verboseness of the same
public class LambdaDemoImpl implements LambdaDemo {
    @Override
    public void valid() {
        System.out.println("Yes, this option is valid");
    }

    public static void main(String[] args) {
        LambdaDemo lambda = new LambdaDemoImpl();
        lambda.valid();
    }


}
