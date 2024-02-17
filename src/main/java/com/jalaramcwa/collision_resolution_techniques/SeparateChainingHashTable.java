package com.jalaramcwa.collision_resolution_techniques;

import java.util.LinkedList;

public class SeparateChainingHashTable {

    int size;
    LinkedList<String>[] table;

    public SeparateChainingHashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for(int i = 0 ; i < size ; i++){
            table[i] = new LinkedList<>();
        }
    }

    public int hashFunction(String key){
        return key.length() % size;
    }

    public void insert(String key, String value){
        int index = hashFunction(key);
        table[index].add(value);
    }

    public void display(){
        for(int i = 0 ; i < size ; i++){
            System.out.print("Index " + i + ": ");
            for(String str : table[i]){
                System.out.print(str+"  -> ");
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SeparateChainingHashTable hashTable = new SeparateChainingHashTable(10);
        hashTable.insert("apple", "red");
        hashTable.insert("banana", "yellow");
        hashTable.insert("grapes", "purple");
        hashTable.insert("orange", "orange");
        hashTable.insert("apple", "green"); // Collision for "apple"
        hashTable.display();
    }
}
