package com.achais.leetcode.offer;

public class Solution10 {
    /*
    第二道 解法3 动态规划
     */
    public int numWays(int n) {
        int a = 1, b = 1, sum;

        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }

        return a;
    }

    /*
    第二道 解法2 记忆化递归法
     */
    public int numWays2(int n) {
        int[] dp = new int[Math.max(n + 1, 3)];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }

        return dp[n];
    }

    /*
    第二道 解法1 递归
     */
    public int numWays1(int n) {
        if (n == 0) {
            return 1;
        }
        if (n <= 2) {
            return n;
        }

        return numWays(n - 1) + numWays(n - 2);
    }

    /*
    第一道 解法2 动态规划
     */
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    /*
    第一道 解法1 记忆化递归法
     */
    public int fib1(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                arr[i] = i;
            } else {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
            }
        }

        return arr[n];
    }

    public static void main(String[] args) {
        int n = 2;

        Solution10 solution = new Solution10();
        Integer stdout = solution.numWays(n);

        System.out.println(stdout);
    }
}
