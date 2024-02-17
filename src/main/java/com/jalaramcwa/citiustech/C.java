package com.jalaramcwa.citiustech;

public class C extends P{
    void m1()
    {
        System.out.println("In m1 C");
    }

    void c2()
    {
        System.out.println("In c2 C");
    }

    public static void main(String[] args) {

        P p = new C();
        p.m1();
        p.m1();

    }
}
