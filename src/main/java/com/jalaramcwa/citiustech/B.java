package com.jalaramcwa.citiustech;

import java.io.IOException;

public class B extends A{
    public void m1() throws IOException /*
                                        If parent class method throws parent Exception class and subClass override parent
                                        class method with throw same class name exception or subClass exception then it will work.
                                        else it will give compile time error
                                        */
    {
        System.out.println("In m1 B");
    }

    public static void main(String[] args) {
        A a = new A();
        try {
            a.m1();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
