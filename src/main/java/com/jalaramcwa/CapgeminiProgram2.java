package com.jalaramcwa;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CapgeminiProgram2 {

    public static void main(String[] args) {

        String input = "abecacd";
        LinkedHashMap<Character, Long> map = input.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        map.entrySet().stream().filter(i->i.getValue() == 1).findFirst().stream().toList().forEach(System.out::println);


        //Create an integer list and find out all the numbers starting with 1 using java 8 Stream api's


        //List.of(1,13,41,53,16,12).stream().map(i->(String.valueOf(i)).filter(i->i==1).collect(Collectors.toList()).forEach(System.out::println());

    }
}
