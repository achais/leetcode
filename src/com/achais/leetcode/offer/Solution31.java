package com.achais.leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
//        Deque<Integer> stack = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i : pushed) {
            stack.push(i);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};

        Solution31 solution = new Solution31();
        boolean stdout = solution.validateStackSequences(pushed, popped);

        System.out.println(stdout);
    }
}
