package com.nvm.java8.stream.example;

import java.util.*;
import java.util.stream.Collectors;

public class SortedMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(3, "three");
        map.put(2, "two");
        map.put(4, "four");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> updated_list = list.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(updated_list);
    }
}
