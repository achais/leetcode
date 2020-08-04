package com.achais.leetcode;

public class Solution58 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int n = 2;

        Solution58 solution = new Solution58();
        String stdout = solution.reverseLeftWords(s, n);

        System.out.println(stdout);
    }
}
