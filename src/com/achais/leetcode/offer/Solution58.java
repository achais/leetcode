package com.achais.leetcode.offer;

public class Solution58 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        String stdin = "abcdefg";
        int k = 2;

        Solution58 solution = new Solution58();
        String stdout = solution.reverseLeftWords(stdin, k);

        System.out.println(stdout);
    }
}
