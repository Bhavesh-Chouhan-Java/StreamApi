package com.jalaramcwa.start_with_java.oops.abstraction;

public class MarutiCar implements Car{
    @Override
    public void start() {
        System.out.println("Start Maruti Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop Maruti Car");
    }
}
