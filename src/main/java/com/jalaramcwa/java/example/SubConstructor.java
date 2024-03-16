package com.jalaramcwa.java.example;

public class SubConstructor extends Constructor{
    SubConstructor(){
        System.out.println("I am Child");
    }

    public static void main(String[] args) {
        new SubConstructor();
    }
}
