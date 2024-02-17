package com.jalaramcwa;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ABCProgram {
    public static void main(String[] args) {
        String str = "thisismyfirstjavainterview";

        Map<Character, Long> collect = str.chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((a,b)-> System.out.print(a+":"+b+",   "));

        Map.Entry<Character, Long> characterLongEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println( "\n1st Max "+  characterLongEntry.getKey()+" = "+ characterLongEntry.getValue());
        Map.Entry<Character, Long> characterLongEntry1 = collect.entrySet().stream().filter(i -> i.getValue() != characterLongEntry.getValue()).max(Map.Entry.comparingByValue()).get();
        System.out.println( "2nd Max "+  characterLongEntry1.getKey()+" = "+ characterLongEntry1.getValue());

    }
}
