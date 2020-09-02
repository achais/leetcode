package com.achais.leetcode;

public class Solution202 {
    public boolean isHappy(int n) {
        int count = 0;
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
            if (count++ > 10000) {
                return false;
            };
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 7;

        Solution202 solution = new Solution202();
        boolean stdout = solution.isHappy(n);

        System.out.println(stdout);
    }
}
