package com.achais.leetcode;

public class Solution1413 {
    public int minStartValue(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(num, min);
        }
        return min >= 1 ? 1 : 1 - min;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -5, -1};

        Solution1413 solution = new Solution1413();
        Integer stdout = solution.minStartValue(nums);

        System.out.println(stdout);
    }
}
