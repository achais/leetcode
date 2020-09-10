package com.achais.leetcode;

import java.util.Deque;
import java.util.LinkedList;

class MinStack155 {

    Deque<Integer> A, B;

    /**
     * initialize your data structure here.
     */
    public MinStack155() {
        // 正常栈
        A = new LinkedList<>();
        // 大根堆
        B = new LinkedList<>();
    }

    public void push(int x) {
        A.push(x);
        if (B.isEmpty() || B.peek() >= x) {
            B.push(x);
        }
    }

    public void pop() {
        if (A.pop().equals(B.peek())) {
            B.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int getMin() {
        return B.peek();
    }
}

public class Solution155 {
    public int run(String s) {
        return 0;
    }

    public static void main(String[] args) {
        String stdin = "Hello World";

        Solution155 solution = new Solution155();
        Integer stdout = solution.run(stdin);

        System.out.println(stdout);
    }
}
