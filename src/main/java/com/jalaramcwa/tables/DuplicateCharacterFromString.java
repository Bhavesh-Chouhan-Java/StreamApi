package com.jalaramcwa.tables;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterFromString {
    public static void main(String[] args) {

        String name = "BhaveshChouhan";

        //name.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting())).forEach((a,b)->System.out.println(a+" "+b));

        Set<Character> set = new HashSet<>();

        LinkedHashMap<Character, Long> collect = name.chars()
                .mapToObj(i -> (char) i).filter(i -> !set.add(i))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        collect.forEach((a,b)->System.out.println(a +" - "+b));

        Map map = new HashMap();

    }
}
