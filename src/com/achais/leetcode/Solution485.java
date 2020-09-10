package com.achais.leetcode;

public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0, j = 0, res = 0;
        while (j < nums.length) {
            if (nums[j] != 1) {
                res = Math.max(res, j - i);
                i = j + 1;
            }
            j++;
        }
        return Math.max(res, j - i);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};

        Solution485 solution = new Solution485();
        Integer stdout = solution.findMaxConsecutiveOnes(nums);

        System.out.println(stdout);
    }
}
