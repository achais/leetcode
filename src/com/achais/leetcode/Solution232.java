package com.achais.leetcode;

import java.util.Deque;
import java.util.LinkedList;

class MyQueue232 {
    //入栈
    Deque<Integer> s1 = new LinkedList<>();
    // 出栈
    Deque<Integer> s2 = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyQueue232() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        s1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        peek();
        return s2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

public class Solution232 {
    public static void main(String[] args) {
        MyQueue232 obj = new MyQueue232();
        obj.push(1);
        int param_2 = obj.pop();
        System.out.println(param_2);

        obj.push(2);
        int param_3 = obj.peek();
        System.out.println(param_3);

        boolean param_4 = obj.empty();
        System.out.println(param_4);
    }
}
