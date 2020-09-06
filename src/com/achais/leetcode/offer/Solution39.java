package com.achais.leetcode.offer;

import java.util.Arrays;

public class Solution39 {
    /**
     * 摩尔投票法
     */
    public int majorityElement(int[] nums) {
        int votes = 0;
        int x = nums[0];
        for (int num : nums) {
            if (votes == 0) {
                x = num;
            }
            votes += num == x ? 1 : -1;
        }
        return x;
    }

    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};

        Solution39 solution = new Solution39();
        Integer stdout = solution.majorityElement(nums);

        System.out.println(stdout);
    }
}
