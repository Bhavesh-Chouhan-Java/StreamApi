package com.jalaramcwa.java.example;

import java.util.Arrays;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class FutureClass {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        executorService1.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("execute");
            }
        });
        executorService1.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("execute");
            }
        });
        executorService1.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("execute");
            }
        });
        executorService1.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("execute");
            }
        });

        Future<?> submit = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("submit");
            }
        });
        //submit.cancel(true);

        boolean cancelled = submit.isCancelled();
        System.out.println("cancelled : "+cancelled);
        boolean done = submit.isDone();
        System.out.println("done : "+done);


        Future<String> submit1 = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "I am answering";
            }
        });

        try {
            String result = submit1.get();
            System.out.println("result = " + result);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }


        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
                return "Hello CompletableFuture!";
            }
        };


        CompletableFuture<String> future = CompletableFuture.supplyAsync(supplier);


        try {
            String[] str = {"Hello","India"};
            CompletableFuture<String[]> completableFuture = future.thenApply(i -> i.split(" "));
            //completableFuture.complete(str);
            String[] result = completableFuture.get();
            System.out.println("Result = " + Arrays.toString(result));
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
