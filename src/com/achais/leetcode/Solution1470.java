package com.achais.leetcode;

import java.util.Arrays;

public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i * 2] = nums[i];
            ans[i * 2 + 1] = nums[i + n];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        Solution1470 solution = new Solution1470();
        int[] stdout = solution.shuffle(nums, n);

        System.out.println(Arrays.toString(stdout));
    }
}
