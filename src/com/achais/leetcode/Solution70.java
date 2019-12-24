package com.achais.leetcode;

public class Solution70 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] ret = new int[n];
        ret[0] = 1;
        ret[1] = 2;
        for (int i = 2; i < n; i++) {
            ret[i] = ret[i - 1] + ret[i - 2];
        }
        return ret[n - 1];
    }

    public static void main(String[] args) {
        int stdin = 10;

        Solution70 solution = new Solution70();
        int stdout = solution.climbStairs(stdin);

        System.out.println(stdout);
    }
}
