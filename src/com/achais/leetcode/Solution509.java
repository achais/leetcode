package com.achais.leetcode;

public class Solution509 {

    int[] map = new int[31];

    //递归
    public int fib1(int n) {
        if (n < 2) {
            return n;
        } else if (map[n] != 0) {
            return map[n];
        } else {
            map[n] = fib1(n - 1) + fib1(n - 2);
            return map[n];
        }
    }

    //动态规划
    public int fib(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public int fib2(int n) {
        if (n < 2) return n;
        int prev = 0, curr = 1;
        for (int i=2; i<=n; i++) {
            int sum = curr + prev;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

    public static void main(String[] args) {
        int N = 30;

        Solution509 solution = new Solution509();
        Integer stdout = solution.fib(N);

        System.out.println(stdout);
    }
}
