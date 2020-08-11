package com.achais.leetcode;

public class Solution292 {
    /**
     * Nim游戏
     */
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        int n = 4;

        Solution292 solution = new Solution292();
        boolean stdout = solution.canWinNim(n);

        System.out.println(stdout);
    }
}
