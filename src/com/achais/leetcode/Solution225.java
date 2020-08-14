package com.achais.leetcode;

import java.util.LinkedList;
import java.util.Queue;

class MyStack225 {
    private Queue<Integer> queue = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack225() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        int size = queue.size();
        queue.offer(x);
        while (size -- > 0) {
            queue.offer(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

public class Solution225 {
    public int run(String s) {
        return 0;
    }

    public static void main(String[] args) {
        String stdin = "Hello World";

        Solution225 solution = new Solution225();
        Integer stdout = solution.run(stdin);

        System.out.println(stdout);
    }
}
