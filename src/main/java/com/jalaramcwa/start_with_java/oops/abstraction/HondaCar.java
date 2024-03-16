package com.jalaramcwa.start_with_java.oops.abstraction;

public class HondaCar implements Car{

    @Override
    public void start() {
        System.out.println("Start Honda Car ");
    }

    @Override
    public void stop() {
        System.out.println("Stop Honda Car ");
    }
}
