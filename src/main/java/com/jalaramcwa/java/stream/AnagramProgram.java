package com.jalaramcwa.java.stream;

import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramProgram {


    public static void main(String[] args) {
        String str = "aaba";
        String giv = "aaaf";

        Map<Character, Long> collect = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((a,b)-> System.out.println(a+"  "+b));

        Map<Character, Long> collect2 = giv.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect2.forEach((a,b)-> System.out.println(a+"  "+b));

        int f = getCharacter(collect,collect2);
        int f2 = collect2.entrySet().size();

        if(f2 == f){
            System.out.println(true);
        }else{
           System.out.println(false);
        }

        /*for(char c : str.toCharArray()){
            int s = getCharacter(giv,c, str);
            if(s == str.length()){
                System.out.println(s);
            }
        }*/
    }


    private static int getCharacter(Map<Character, Long> collect, Map<Character, Long> collect2){
        int f  = 0;
        for(Map.Entry<Character,Long> map : collect.entrySet()){
            for(Map.Entry<Character,Long> map2 : collect2.entrySet()){
                if(map.getKey() == map2.getKey() && Objects.equals(map.getValue(), map2.getValue())){
                    f++;
                }
            }
        }
        return f;
    }
}
