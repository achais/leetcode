package com.achais.leetcode;

public class Solution509 {
    public int fib(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fib(N - 1) + fib(N - 2);
    }

    public static void main(String[] args) {
        int N = 4;

        Solution509 solution = new Solution509();
        Integer stdout = solution.fib(N);

        System.out.println(stdout);
    }
}
