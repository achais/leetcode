package com.achais.leetcode;

public class Solution1025 {
    public boolean divisorGame(int N) {
        return N % 2 == 0;
    }

    public static void main(String[] args) {
        int N = 3;

        Solution1025 solution = new Solution1025();
        boolean stdout = solution.divisorGame(N);

        System.out.println(stdout);
    }
}
