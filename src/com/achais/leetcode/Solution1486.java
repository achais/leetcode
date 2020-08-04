package com.achais.leetcode;

public class Solution1486 {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        nums[0] = start;
        for (int i = 1; i < n; i++) {
            nums[i] = (start + i * 2) ^ nums[i - 1];
        }
        return nums[n - 1];
    }

    public static void main(String[] args) {
        int n = 5;
        int start = 0;

        Solution1486 solution = new Solution1486();
        Integer stdout = solution.xorOperation(n, start);

        System.out.println(stdout);
    }
}
