package com.jalaramcwa.java.example;

public class MultiThreading implements Runnable {
    private int max;
    private boolean isEven;
    private static Object lock = new Object();
    private static int number = 1;

    public MultiThreading(int max, boolean isEven) {
        this.max = max;
        this.isEven = isEven;
    }
    public static void main(String[] args) {


        Thread thread = new Thread(){
            @Override
            public void run() {
                for(int i = 0 ; i < 10; i++){
                    synchronized (lock) {
                        if (i % 2 != 0) {
                            try {
                                sleep(100);
                                System.out.println(i);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }

                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                for(int i = 0 ; i < 10; i++){
                    synchronized (lock) {
                        if (i % 2 == 0) {
                            try {
                                sleep(100);
                                System.out.println(i);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        };

        thread.start();
        thread2.start();
        try {

            thread.join();
            thread2.join();
        }catch (Exception e){
            e.getMessage();
        }



    }

    @Override
    public void run() {
        if(number <= max){
            synchronized (lock){
                //if((isEven && ))
            }
        }
    }
}
