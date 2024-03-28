package com.jalaramcwa.java.collision_resolution_techniques;

public class DoubleHashingHashTable {
    private final int size;
    private final String[] table;
    private final boolean[] isOccupied;

    public DoubleHashingHashTable(int size) {
        this.size = size;
        table = new String[size];
        isOccupied = new boolean[size];
    }

    private int hashFunction1(String key) {
        return key.length() % size; // First hash function
    }

    private int hashFunction2(String key) {
        return 5 - (key.length() % 5);
    }

    public void insert(String key, String value) {
        int index = hashFunction1(key);
        int step = hashFunction2(key);
        while (isOccupied[index]) {
            index = (index + step) % size; // Double hashing
        }
        table[index] = value;
        isOccupied[index] = true;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (isOccupied[i]) {
                System.out.println("Index " + i + ": " + table[i]);
            } else {
                System.out.println("Index " + i + ": null");
            }
        }
    }

    public static void main(String[] args) {
        DoubleHashingHashTable hashTable = new DoubleHashingHashTable(10);
        hashTable.insert("apple", "red");
        hashTable.insert("banana", "yellow");
        hashTable.insert("grapes", "purple");
        hashTable.insert("orange", "orange");
        hashTable.insert("apple", "green"); // Collision for "apple"
        hashTable.display();
    }
}
