package com.jalaramcwa;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NewProgram {

    public static void main(String[] args) {
        /*int num = 59;
        int m = num/2;
        int flag = 0;

        if(num == 0 || num == 1){
            flag = 1;
        }else {
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }

        try{

        }catch (Exception ignored){

        }

        if(flag == 0){
            System.out.println("Is Prime");
        }else{
            System.out.println("Is Not Prime");
        }*/

        /*String a = "abc";
        String b = new String("abc");
        Map<String,String> map= new HashMap<>();

        map.put("abc","abc");
        map.put(b,"Mumbai");

        System.out.println(map.get(b));*/

        AFinal aFinal = new AFinal();
        aFinal.age = 20;
        System.out.println(""+aFinal.age);


        Map<String, Integer> budget = new HashMap<>();
        budget.put("clothes", 120);
        budget.put("grocery", 150);
        budget.put("transportation", 100);
        budget.put("utility", 130);
        budget.put("rent", 1150);
        budget.put("miscellaneous", 90);

        HashMap<String, Integer> collect = budget.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        collect.forEach((k,v)-> { System.out.println(v); } );


        LinkedHashMap<String, Integer> collect1 = budget.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        collect1.forEach((k,v)-> System.out.println(v));



    }
}

