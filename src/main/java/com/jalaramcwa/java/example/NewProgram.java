package com.jalaramcwa.java.example;

import com.jalaramcwa.java.example.clasess.AFinal;

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






    }
}

