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

        P p = new P();
        p.m1(); //In m1 P
        //p.c2();

        P p2 = new C();
        p2.m1(); //In m1 C

        C c = new C();
        c.m1(); //In m1 C
        c.c2(); //In c2 C
    }

    static {
        System.out.println("CCC");
    }

    {
        System.out.println("))))000((((");
    }
}
