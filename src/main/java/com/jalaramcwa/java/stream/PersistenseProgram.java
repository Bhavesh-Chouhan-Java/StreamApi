package com.jalaramcwa.java.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersistenseProgram {

    public static void main(String[] args) {

        String str = "Hello";

        //Map<Character, Long> collect = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        //collect.entrySet().stream().filter(i->i.getValue()==1).toList().forEach(System.out::println);

        List<Integer> list = List.of(20,20,1, 3, 5, 4, 22, 32, 4, 24,20, 20, 44, 1, 22, 4, 43, 25, 54);
        Integer max = list.stream().max(Integer::compareTo).get();

        LinkedHashMap<Integer, Long> collect1 = list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        //collect1.entrySet().stream().max(Integer::compareTo).filter(k -> k.getValue())

        Long max1 = collect1.values().stream().max(Long::compareTo).get();

        Long l = collect1.values().stream().filter(i -> i != max1).max(Long::compareTo).get();

        Map.Entry<Integer, Long> integerLongEntry = collect1.entrySet().stream().filter(i -> i.getValue() == l).findFirst().get();

        System.out.println(integerLongEntry.getKey());

        //max1.stream().forEach(System.out::println);

        //longStream.forEach(System.out::println);


        //System.out.println("max : "+max);
        /*collect1.entrySet().stream()
                .filter(i->i.getValue().intValue() != max)
                .forEach((a)-> System.out.println(a.getKey()+"  "+a.getValue()));*/
    }
}
