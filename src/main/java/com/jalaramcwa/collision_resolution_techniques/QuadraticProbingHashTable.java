package com.jalaramcwa.collision_resolution_techniques;

public class QuadraticProbingHashTable {
    private int size;
    private String[] table;
    private boolean[] isOccupied;

    public QuadraticProbingHashTable(int size) {
        this.size = size;
        table = new String[size];
        isOccupied = new boolean[size];
    }

    private int hashFunction(String key) {
        return key.length() % size; // Example of a simple hash function
    }

    public void insert(String key, String value) {
        int index = hashFunction(key);
        int i = 1;
        while (isOccupied[index]) {
            index = (index + i * i) % size;
            i++;
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
        QuadraticProbingHashTable hashTable = new QuadraticProbingHashTable(10);
        hashTable.insert("apple", "red");
        hashTable.insert("banana", "yellow");
        hashTable.insert("grapes", "purple");
        hashTable.insert("orange", "orange");
        hashTable.insert("apple", "green"); // Collision for "apple"

        hashTable.display();
    }
}
