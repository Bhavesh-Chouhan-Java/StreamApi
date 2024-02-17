package com.jalaramcwa;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ZensarProgram {
    public static void main(String[] args) {
        String str = "My Name Is Bhavesh Chouhan";

        Map<Character, Long> collect = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        collect.forEach((a,b)-> System.out.println(a+" : "+b));

    }

}
