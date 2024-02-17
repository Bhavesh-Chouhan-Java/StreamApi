package com.jalaramcwa.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {

    static int counter;
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("1Thread : name : "+Thread.currentThread().getName());
                for (int i = 0 ; i < 10000; i++){
                    counter++;
                }
            }
        });

        Future<?> future =  executor.submit(() -> {
            System.out.println("2Thread : name : "+Thread.currentThread().getName());
            for (int i = 0 ; i < 10000; i++){
                counter++;
            }
        });
        System.out.println("3Thread : counter : "+counter);
        System.out.println("4Thread : name : "+Thread.currentThread().getName());



        if(future.isDone()){
            System.out.println("5Thread : counter : "+counter);
        }


    }
}
