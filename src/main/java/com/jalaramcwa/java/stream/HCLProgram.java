package com.jalaramcwa.java.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HCLProgram {
    public static void main(String[] args) {
        String s = "java is programming lang, java is";

        String[] s1 = Arrays.stream(s.split(" ")).toArray(String[]::new);

        Map<String, Long> collect1 = Arrays.stream(s.split(" "))
                .filter(i->!i.contains(","))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect1.forEach((a,b)-> System.out.println(a+":"+b));


        String[] str = s.split(" ");
        Map<String, Long> collect = Arrays.stream(str).filter(i -> !i.contains(",")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //collect1.forEach((a,b)-> System.out.println(a+":"+b));



    }

}
