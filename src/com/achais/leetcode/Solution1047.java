package com.achais.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1047 {
    public String removeDuplicates(String S) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : S.toCharArray()) {
            if (!deque.isEmpty() && deque.peek() == c) {
                deque.pop();
            } else {
                deque.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : deque) {
            sb.append(character);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String stdin = "abbaca";

        Solution1047 solution = new Solution1047();
        String stdout = solution.removeDuplicates(stdin);

        System.out.println(stdout);
    }
}
