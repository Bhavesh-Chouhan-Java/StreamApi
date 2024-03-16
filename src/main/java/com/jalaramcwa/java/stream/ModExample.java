package com.jalaramcwa.java.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModExample {
    public static void main(String[] args) {

        String str = "Bhavesh";

        HashMap<Character, Long> collect = str.chars()
                .mapToObj(i -> (char) i).sorted(Collections.reverseOrder())
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

        Stream<Map.Entry<Character, Long>> sorted = collect.entrySet().stream().sorted();


        //Stream.of(22,55,87,8,97,342).filter(i->i%2==0).toList().forEach(System.out::println);

        //Stream.of(22,55,87,8,97,342).map(Math::sqrt).forEach(System.out::println);

        Integer i = Stream.of(22, 55, 87, 8, 97, 342).reduce(Integer::sum).get();
        System.out.println(i);

        //Stream<Double> doubleStream = lists.stream()
        //Double v = doubleStream.reduce(Double::sum).get();
        //System.out.println(v);

    }
}
