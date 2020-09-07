package com.achais.leetcode.offer;

public class Solution10 {
    /*
    解法2 动态规划
     */
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    /*
    解法1 记忆化递归法
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
        int n = 5;

        Solution10 solution = new Solution10();
        Integer stdout = solution.fib(n);

        System.out.println(stdout);
    }
}
