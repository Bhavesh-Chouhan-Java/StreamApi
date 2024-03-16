package com.jalaramcwa.java.example;

import java.util.Arrays;

public class Program2 {
    static int s = 1;
    public static void main(String[] args) {
        //i/p [1,2,3,4,5,6,7]
        //i/p: n = 3
        //o/p: [5,6,7,1,2,3,4]

        int[] a = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));
        getArray(a);
    }

    private static void getArray(int[] a){
        int[] b = new int[a.length];
        for(int i = 0 ; i < a.length ; i ++){
            if(i == a.length-1){
                b[0] = a[i];
            }else {
                b[i + 1] = a[i];
            }
        }
        if(3 == s){
            System.out.println(Arrays.toString(b));
        }else{
            s =s+1;
            a = b;
            getArray(a);
        }
    }
}
