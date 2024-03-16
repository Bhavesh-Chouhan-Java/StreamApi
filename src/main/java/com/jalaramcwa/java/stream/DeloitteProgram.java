package com.jalaramcwa.java.stream;

import java.util.stream.Stream;

public class DeloitteProgram {
    public static void main(String[] args) {
        //System.out.println(findNonRepeatingIndex("abcdaef"));

        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter(i->i%2!=0)
                .map(Math::sqrt)
                .toList()
                .forEach(System.out::println);
    }

    public static int findNonRepeatingIndex(String s){
        for(int i = 0 ; i < s.length() ; i ++){
            char c = s.charAt(i);
            System.out.println(s.indexOf(c)+"  "+s.lastIndexOf(c));
            if(s.indexOf(c) == s.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }

}
