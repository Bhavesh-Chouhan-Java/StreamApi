package com.jalaramcwa;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class ParallelStreamExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 2, 3, 6, 8, 5, 2, 4, 6, 7, 8, 4, 2);
        System.out.println("stream");
        list.stream()
                .map(number -> {
                    System.out.println("Processing " + number + " in thread " + Thread.currentThread().getName());
                    return number * 2;
                })
                .forEach(result -> System.out.println("Processed result: " + result));
        System.out.println("\n\n\n------parallelStream");
        list.parallelStream().map(number -> {
            System.out.println("Processing " + number + " in thread " + Thread.currentThread().getName());
            return number * 2;
        }).forEach(result -> System.out.println("Processed result: " + result));

        Map<String,Integer> map = Map.of("a",1,"b",2,"c",3);
        Map.Entry<String,Integer> entry = Map.entry("a",1);
        map.entrySet().stream().forEach((a)-> System.out.println(a.getValue()));


        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 10;
        });

        CompletableFuture<Integer> integerCompletableFuture2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 20;
        });

        CompletableFuture<Integer> combinedFuture = integerCompletableFuture.thenCombine(integerCompletableFuture2, (result1, result2) -> result1 + result2);
        int combinedResult = combinedFuture.get();
        System.out.println("Combined result: " + combinedResult);
    }
}
