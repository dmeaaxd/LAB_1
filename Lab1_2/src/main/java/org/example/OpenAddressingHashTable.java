package org.example;

public class OpenAddressingHashTable {
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int[] table;
    private int size;

    public OpenAddressingHashTable() {
        this(DEFAULT_CAPACITY);
    }

    public OpenAddressingHashTable(int capacity) {
        this.capacity = capacity;
        this.table = new int[capacity];
        this.size = 0;
    }

    public void add(int key) {
        if (key < 0) {
            throw new IllegalArgumentException("Key must be a non-negative number");
        }

        if (size() == capacity) {
            throw new IllegalStateException("Hash table is full");
        }

        if (contains(key)) {
            throw new IllegalArgumentException("Key already exists in the table");
        }

        int index = hash(key);
        while (table[index] != 0) {
            index = (index + 1) % capacity;
        }
        table[index] = key;
        size++;
    }


    public boolean contains(int key) {
        if (key == 0) {
            return table[0] == 0;
        }

        int index = hash(key);
        while (table[index] != 0) {
            if (table[index] == key) {
                return true;
            }
            index = (index + 1) % capacity;
        }
        return false;
    }


    private int hash(int key) {
        int index = key % capacity;
        return index < 0 ? index + capacity : index;
    }


    private int size() {
        return size;
    }
}
