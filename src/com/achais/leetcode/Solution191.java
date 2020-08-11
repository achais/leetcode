package com.achais.leetcode;

public class Solution191 {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans++;
            n = n & (n - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 0b11111111111111111111111111111101;

        Solution191 solution = new Solution191();
        Integer stdout = solution.hammingWeight(n);

        System.out.println(stdout);
    }
}
