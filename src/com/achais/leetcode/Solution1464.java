package com.achais.leetcode;

import java.util.Arrays;

public class Solution1464 {
    public int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }

    public int maxProduct2(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};

        Solution1464 solution = new Solution1464();
        Integer stdout = solution.maxProduct(nums);

        System.out.println(stdout);
    }
}
