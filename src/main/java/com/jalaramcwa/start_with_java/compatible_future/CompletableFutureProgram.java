package com.jalaramcwa.start_with_java.compatible_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureProgram {

    public static void main(String[] args) {

        //Todo CompletableFuture is part of java.util.concurrent package.
        // CompletableFuture is power full tool for handling asynchronous programming.
        // CompletableFuture is used to represent a future result of an asynchronous computation.
        // CompletableFuture is used especially in scenarios where you want to execute tasks concurrently and then combine their results.

        //todo Creating a CompletableFuture:
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->"Hello");
        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(()-> System.out.println("Hello"));

        // todo Chaining Asynchronous Operations:
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->"Bhavesh")
                .thenApply(s->s + " World").thenApply(String::toLowerCase);

        try {
            System.out.println("future : "+future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        //todo Handling Completion:
        CompletableFuture.supplyAsync(()->"Bhavesh")
                .thenAccept(System.out::println)
                .exceptionally(ex -> { System.out.println("Execution occurred: "+ex.getMessage()); return null; });

        // todo Combining Multiple CompletableFutures:
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->"Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->"Bhavesh");

        CompletableFuture<String> combinedFuture = future1.thenCombine(future2,(s1,s2)-> s1 +" "+ s2);

        String result = combinedFuture.join();
        System.out.println("result :"+result);
        try {
            System.out.println("Task Combine : "+combinedFuture.get());;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
