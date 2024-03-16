package com.jalaramcwa.java.example;

public class GoDIgit {
    public static void main(String[] args) {
        //Create a method which accept a array of integer and returns second-largest integer number
        //value from the given integer array.

        int[] arr = {11,1,4,7,0,-12,-34,-54,-1,-2,-5,-55};

        int f = arr[arr.length-1];
        int s = 0;

        for (int j : arr) {
            if (j > f) {
                s = f;
                f = j;
            } else if (j > s) {
                s = j;
            }
        }

        System.out.println("First  :   "+f);
        System.out.println("secondLargest : " +s);
    }
}
