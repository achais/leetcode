package com.achais.leetcode;

import java.util.Arrays;

public class Solution1480 {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] stdout = runningSum(nums);
        System.out.println(Arrays.toString(stdout));
    }
}
