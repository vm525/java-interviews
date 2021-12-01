package com.nvm.java8.stream.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ParallelStream {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long sum = LongStream.rangeClosed(1, 100000).sum();
        long end = System.currentTimeMillis();
        System.out.println("Plain Stream time taken: " + Math.abs(end - start));
        System.out.println("sum normal: " + sum);
        System.out.println("------------------------------------------");
        start = System.currentTimeMillis();
        sum = LongStream.rangeClosed(1, 100000).parallel().sum();
        end = System.currentTimeMillis();
        System.out.println("Parallel Stream time taken: " + Math.abs(end - start));
        System.out.println("sum parallel: " + sum);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("before: " + list);
        list = list.stream()
                .filter(num -> num != 4)
                .collect(Collectors.toList());
        System.out.println("after: " + list);
    }
}
