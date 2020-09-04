package com.achais.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Bucket705 {
    private LinkedList<Integer> bucket;

    Bucket705() {
        this.bucket = new LinkedList<>();
    }

    public void add(Integer key) {
        if (!this.bucket.contains(key)) {
            this.bucket.addFirst(key);
        }
    }

    public boolean contains(Integer key) {
        return this.bucket.contains(key);
    }

    public void remove(Integer key) {
        this.bucket.remove(key);
    }
}

class MyHashSet705 {

    List<Bucket705> hashSet;
    int keySpace = 2069;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet705() {
        hashSet = new ArrayList<Bucket705>(keySpace);
        for (int i = 0; i < keySpace; i++) {
            hashSet.add(new Bucket705());
        }
    }

    public void add(int key) {
        hashSet.get(key % keySpace).add(key);
    }

    public void remove(int key) {
        hashSet.get(key % keySpace).remove(key);
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return hashSet.get(key % keySpace).contains(key);
    }
}

public class Solution705 {
    public static void main(String[] args) {
        MyHashSet705 hashSet = new MyHashSet705();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.contains(1); // 返回 true
        hashSet.contains(3); // 返回 false (未找到)
        hashSet.add(2);
        hashSet.contains(2); // 返回 true
        hashSet.remove(2);
        hashSet.contains(2); // 返回  false (已经被删除)
    }
}
