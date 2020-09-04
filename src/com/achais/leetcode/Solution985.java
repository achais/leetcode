package com.achais.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Pair<K, V> {
    public K key;
    public V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class Bucket {
    private List<Pair<Integer, Integer>> bucket;

    Bucket() {
        this.bucket = new LinkedList<>();
    }

    public Integer get(Integer key) {
        for (Pair<Integer, Integer> integerIntegerPair : this.bucket) {
            if (integerIntegerPair.key.equals(key)) {
                return integerIntegerPair.value;
            }
        }
        return -1;
    }

    public void remove(Integer key) {
        this.bucket.removeIf(integerIntegerPair -> integerIntegerPair.key.equals(key));
    }

    public void update(Integer key, Integer value) {
        boolean found = false;
        for (Pair<Integer, Integer> integerIntegerPair : this.bucket) {
            if (integerIntegerPair.key.equals(key)) {
                integerIntegerPair.value = value;
                found = true;
            }
        }
        if (!found) {
            this.bucket.add(new Pair<>(key, value));
        }
    }
}

class MyHashMap985 {

    List<Bucket> hashTable;
    int keySpace = 2069;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap985() {
        hashTable = new ArrayList<>(keySpace);
        for (int i = 0; i < keySpace; i++) {
            hashTable.add(new Bucket());
        }
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        hashTable.get(key % keySpace).update(key, value);
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        return hashTable.get(key % keySpace).get(key);
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        hashTable.get(key % keySpace).remove(key);
    }
}

public class Solution985 {
    public static void main(String[] args) {
        MyHashMap985 hashMap = new MyHashMap985();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.get(1);// 返回 1
        hashMap.get(3);// 返回 -1 (未找到)
        hashMap.put(2, 1);// 更新已有的值
        hashMap.get(2);// 返回 1
        hashMap.remove(2);// 删除键为2的数据
        int v = hashMap.get(2);// 返回 -1 (未找到)
        System.out.println(v);
    }
}
