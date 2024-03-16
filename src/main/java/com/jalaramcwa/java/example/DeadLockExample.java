package com.jalaramcwa.java.example;

public class DeadLockExample {
    public static void main(String[] args) {
        Object resource1 = new Object();
        Object resource2 = new Object();

        Thread thread = new Thread(){
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println("Thread 1: Locked resource1");
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }

                    synchronized (resource2){
                        System.out.println("Thread 1: Locked resource2");
                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                synchronized (resource2){
                    System.out.println("Thread 2: Locked resource2");
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }

                    synchronized (resource1){
                        System.out.println("Thread 2: Locked resource1");
                    }
                }
            }
        };

        thread.start();
        thread2.start();
    }
}
