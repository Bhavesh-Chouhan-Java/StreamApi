package com.jalaramcwa;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CapgeminiStreamProgram {

    public static void main(String[] args) {
        String str = "capgeminibanglore";
        //i=2

        LinkedHashMap<Character, Long> collect = str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        List<Map.Entry<Character, Long>> collect1 = collect.entrySet()
                .stream()
                .filter((i) -> i.getValue() > 1).toList();

        Map.Entry<Character, Long> characterLongEntry = collect1.stream().findFirst().get();
        System.out.println(characterLongEntry.getKey() +":"+ characterLongEntry.getValue());

        //collect1.forEach(System.out::println);

    }
}
