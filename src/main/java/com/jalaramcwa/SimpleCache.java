package com.jalaramcwa;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleCache<K,V> {
    private final int capacity;
    private final Map<K,V> cache;

    public SimpleCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<K,V>(capacity,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return this.size() > capacity;
            }
        };
    }

    public static void main(String[] args) {
        SimpleCache<String,Integer> cache  = new SimpleCache<>(3);
        cache.put("A",1);
        cache.put("B",2);
        cache.put("C",3);
        System.out.println(cache.get("A"));
        System.out.println(cache.get("B"));
        cache.put("D",4);
        System.out.println(cache.get("A"));
        System.out.println(cache.get("D"));
    }

    private synchronized int size(){
        return cache.size();
    }

    private synchronized V get(K key){
        return cache.get(key);
    }

    private synchronized void put(K key, V value){
        cache.put(key,value);
    }

    private synchronized void clear(){
        cache.clear();
    }
}
