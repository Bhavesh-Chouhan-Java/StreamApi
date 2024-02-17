package com.jalaramcwa;


import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClass {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        //int result = atomicInteger.incrementAndGet();
        //System.out.println("result = " +result);
        int result2 = atomicInteger.getAndIncrement();
        System.out.println("result2 = " +result2);

        atomicInteger.compareAndSet(result2,23);
        System.out.println("result2 = " +atomicInteger.get());


    }
}
