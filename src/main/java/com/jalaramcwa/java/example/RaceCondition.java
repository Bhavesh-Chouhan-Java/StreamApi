package com.jalaramcwa.java.example;

public class RaceCondition {

    private static int counter = 0;

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0 ; i < 10000; i++){
                counter++;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0 ; i < 10000; i++){
                counter++;
            }
        });

        System.out.println("First "+Thread.currentThread().getName());
        //thread1.setDaemon(true);

        thread1.start();
        thread2.start();

        // Waiting for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Exception : "+e.getMessage());
        }

        System.out.println("Final Counter Value: " + counter);

    }
}
