package com.achais.leetcode.offer;

public class Solution15 {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n > 0) {
            n = n & (n - 1);
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 0b00000000000000000000000000001011;

        Solution15 solution = new Solution15();
        Integer stdout = solution.hammingWeight(n);

        System.out.println(stdout);
    }
}
