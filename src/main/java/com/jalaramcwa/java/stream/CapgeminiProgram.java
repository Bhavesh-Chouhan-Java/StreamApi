package com.jalaramcwa.java.stream;

import java.util.*;

public class CapgeminiProgram {
    public static void main(String[] args) {

        int[] arr = {10,15,8,49,25,98,98,32,15};
        Integer max1 = Arrays.stream(arr).max().getAsInt();
        //System.out.println(max1);

        List<Integer> arr1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer max = arr1.stream().max(Integer::compareTo).get();
        //System.out.println(max);



        int[] arr2 = {121,332,213,524,721};
        //: Using Stream API, filter for those values which have 2 in the middle position and find the average of
        // those numbers( here, 121, 524, 721)

        List<String> list = Arrays.stream(arr2).mapToObj(String::valueOf).filter(i->i.length()>2).toList().stream().filter(i -> i.charAt(i.length()/2) == '2').toList();

        //list.forEach(System.out::println);

        String str = "capgemini";
        StringBuilder builder = new StringBuilder();
        int n = 3;
        for(int i = 0 ; i < str.length() ; i++){
            if(i % 2 == 0){
                builder.append(str.charAt(i));
            }else{
                builder.append("$");
            }
            /*if(i == n){
                n=n+4;
                builder.append("$");
            }else{
                builder.append(str.charAt(i));
            }*/
        }
        //System.out.println(builder);

        String str11 = "bhavesh";
        String str22 = "";
        for(int a = str11.length()-1 ; a >= 0 ; a-- ){

            str22 =  str11.charAt(a)+str22;

        }

        System.out.println(str22);

    }

}
