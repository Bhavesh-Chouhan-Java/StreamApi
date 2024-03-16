package com.jalaramcwa.java.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CoforgeProgram {
    public static void main(String[] args) {
        Integer[] intArr = {2,3,4,6,3,7,6,7,8,9};
        Set<Integer> set = new HashSet<>();
        List<Integer> list1 = Arrays.stream(intArr).filter(i -> !set.add(i)).toList();
        list1.forEach(System.out::println);

        //print the elements which are duplicate, by using stream api
        Map<Integer, Long> collect = Arrays.stream(intArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Map.Entry<Integer, Long>> list = collect.entrySet().stream().filter(i -> i.getValue() > 1).toList();
        //collect.forEach((a,b)-> System.out.println(a+"  : "+b));
        //list.forEach(System.out::println);
    }
}
