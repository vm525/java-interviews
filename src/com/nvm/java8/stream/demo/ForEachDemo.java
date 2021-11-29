package com.nvm.java8.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Oranges");
        fruitsList.add("Mangoes");
        fruitsList.add("Banana");
        fruitsList.add("Pomegranate");
        fruitsList.add("Dragon fruit");
        fruitsList.add("Grapes");

        // traditional mechanical way of doing things
        for(int i = 0; i < fruitsList.size(); ++i) {
            System.out.println("Mech way: " + fruitsList.get(i));
        }

        // traditional approach of external iterator using for-each loop
        for(String fruit: fruitsList) {
            System.out.println("little-bit better way: " + fruit);
        }

        // Behold stream and forEach to simplify our lives
        fruitsList.stream().forEach(fruit -> System.out.println("Lambda way: " + fruit));

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        // forEach bi-consumer example for maps without stream
        // we cannot assign stream directly to a map.
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        map.values().forEach(System.out::println); // prints only the values
        // Alternate way
        map.values().stream().forEach(System.out::println); // prints only the values with Stream, but not needed.
        map.keySet().forEach(System.out::println); // prints the keys only
        map.entrySet().forEach(System.out::println); // prints the entire entrySet: Set<Map.Entry<K,V>>
    }
}
