package com.nvm.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        String[] arr = {"1", "123", "4", "52", "74"};
//        Arrays.stream(arr).filter(arg -> Integer.parseInt(arg) % 2 == 0).forEach(System.out::println);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 100; ++i) {
            list.add(i);
        }

        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
