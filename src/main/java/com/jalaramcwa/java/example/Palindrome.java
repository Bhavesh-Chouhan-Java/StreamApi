package com.jalaramcwa.java.example;

public class Palindrome {
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
    }
}
