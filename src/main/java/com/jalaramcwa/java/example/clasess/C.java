package com.jalaramcwa.java.example.clasess;

class C {
    private int x = 20;
    public void print(){
        System.out.println("Print C");
    }


    public static void main(String[] args) {
        method(null);

    }

    public static void method(Object o) {
        System.out.println("Object method");
    }
    public static void method(String s) {
        System.out.println("String method");
    }


}
