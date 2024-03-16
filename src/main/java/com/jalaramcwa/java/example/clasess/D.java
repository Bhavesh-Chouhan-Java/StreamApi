package com.jalaramcwa.java.example.clasess;

public class D extends C {
    @Override
    public void print() {
        System.out.println("Print D");
    }

    public static void main(String[] args) {
        C b = new C();
        b.print();
    }
}
