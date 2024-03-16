package com.jalaramcwa.java.tables;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewProgram {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 1, 22, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 9, 9, 10, 10);

        Predicate<Integer> predicate1 = i -> i == 1;
        boolean b = list.stream().anyMatch(predicate1);

        Function<Integer,Integer> function1 = (a)->a.compareTo(1);
        Stream<Integer> stream = list.stream().map(function1);
        List<Integer> intList = stream.toList();

        BinaryOperator<Integer> integerBinaryOperator1 = (i,j) -> i;
        Optional<Integer> reduce = list.stream().reduce(integerBinaryOperator1);
        reduce.get();


        Set<Integer> set = new HashSet<>();
        Predicate<Integer> predicate = i->!set.add(i);
        Set<Integer> collect = list.stream().filter(predicate).collect(Collectors.toSet());
        collect.forEach(System.out::println);


        for(int i = collect.size()-1 ; i > 0 ; i--){
            //System.out.println("args = " + collect);
        }
        int[] numbers = {1, 2, 3, 4, 1, 2, 3, 5, 6, 5, 7};
        Map<Integer,Long> map = Arrays.stream(numbers).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //map.forEach((k,v)->System.out.println(v));

        Integer i = map.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No non-repeated number found"));
        System.out.println("args = " + i);
    }
}
