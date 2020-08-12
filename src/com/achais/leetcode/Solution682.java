package com.achais.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution682 {
    public int calPoints(String[] ops) {
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : ops) {
            if (stack.isEmpty()) {
                stack.push(Integer.parseInt(op));
            } else if ("+".equals(op)) {
                int pre1 = stack.pop();
                int pre2 = stack.pop();
                int cur = pre1 + pre2;
                stack.push(pre2);
                stack.push(pre1);
                stack.push(cur);
            } else if ("D".equals(op)) {
                stack.push(stack.peek() * 2);
            } else if ("C".equals(op)) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        for (Integer integer : stack) {
            ans += integer;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};

        Solution682 solution = new Solution682();
        Integer stdout = solution.calPoints(ops);

        System.out.println(stdout);
    }
}
