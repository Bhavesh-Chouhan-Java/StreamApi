package com.jalaramcwa.collision_resolution_techniques;

public class LinearProbingHashTable {
    private final int size;
    private final String[] table;
    private final boolean[] isOccupied;

    public LinearProbingHashTable(int size) {
        this.size = size;
        table = new String[size];
        isOccupied = new boolean[size];
    }

    private int hashFunction(String key) {
        return key.length() % size;
    }

    public void insert(String key, String value) {
        int index = hashFunction(key);
        System.out.println("INDEX :"+ index);
        if(isOccupied[index]) {
            index = (index + 1) % size;     // Linear probing
        }
        table[index] = value;
        isOccupied[index] = true;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if(isOccupied[i]){
                System.out.println("Index " + i + ": " + table[i]);
            }else{
                System.out.println("Index " + i + ": null");
            }
        }
    }

    public static void main(String[] args) {
        LinearProbingHashTable hashTable = new LinearProbingHashTable(10);
        hashTable.insert("apple", "red");
        hashTable.insert("banana", "yellow");
        hashTable.insert("grapes", "purple");
        hashTable.insert("orange", "orange");
        hashTable.insert("apple", "green"); // Collision for "apple"
        hashTable.display();
    }
}
