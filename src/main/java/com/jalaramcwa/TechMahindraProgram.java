package com.jalaramcwa;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TechMahindraProgram {
    public static void main(String[] args) {

        String str = "BhaveshBChouhan";

        List<Map.Entry<Character, Long>> list = str.chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() == 1)
                .findFirst().stream().toList();

        list.forEach((a)-> System.out.println(a.getKey()));
    }
}
