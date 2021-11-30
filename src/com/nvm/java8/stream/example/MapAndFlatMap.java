package com.nvm.java8.stream.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> updated_list = list.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println("mapped list: " + updated_list);
        List<List<Integer>> matrix = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        System.out.println("matrix: " + matrix);
        System.out.println("flatMapped list: " + matrix.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
    }
}
