package com.jalaramcwa.java.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class UniqueElement {

    public static void main(String[] args) {
        int[] input = {1,2,3,2,1};
        Set<Integer> set = new HashSet<>();
        Predicate<Integer> predicate = set::add;
        List<Integer> collect = Arrays.stream(input).boxed().filter(predicate).toList();
        collect.forEach(System.out::print);

    }
}
