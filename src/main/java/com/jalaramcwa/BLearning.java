package com.jalaramcwa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class BLearning {
    public static void main(String[] args) {

        String str = "HellolleH";
        String str2 = "";
        for(int i = str.length()-1 ; i >= 0 ; i--){
            str2 += str.charAt(i);
        }
        if(str2.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }




        int[] input = {1,2,3,2,1};
        Set<Integer> set = new HashSet<>();
        Predicate<Integer> predicate = set::add;
        List<Integer> collect = Arrays.stream(input).boxed().filter(predicate).toList();
        collect.forEach(System.out::print);

    }
}
