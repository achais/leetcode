package com.achais.leetcode;

import java.util.Arrays;

public class Solution918 {
    public int maxSubArray(int[] nums) {
        int[] memo = new int[nums.length];
        memo[0] = nums[0];
        int ret = memo[0];
        for (int i=1; i<nums.length; i++) {
            memo[i] = Math.max(memo[i-1] + nums[i], nums[i]);
            ret = Math.max(ret, memo[i]);
        }
        return ret;
    }

    public int minSubArray(int[] nums) {
        int[] memo = new int[nums.length];
        memo[0] = nums[0];
        int ret = memo[0];
        for (int i=1; i<nums.length; i++) {
            memo[i] = Math.min(memo[i-1] + nums[i], nums[i]);
            ret = Math.min(ret, memo[i]);
        }
        return ret;
    }

    public int maxSubarraySumCircular(int[] nums) {
        if (nums.length == 1) return nums[0];
        int ret1 = maxSubArray(nums);
        if (ret1 < 0) return ret1;
        int ret2 = minSubArray(nums);
        int sum = Arrays.stream(nums).sum();
        return Math.max(ret1, sum - ret2);
    }

    public static void main(String[] args) {
//        int[] stdin = {3,-2,2,-3};
        int[] stdin = {-3,-2,-3};
//        int[] stdin = {1,-2,3,-2};
//        int[] stdin = {5,-3,5};

        Solution918 solution = new Solution918();
        Integer stdout = solution.maxSubarraySumCircular(stdin);

        System.out.println(stdout);
    }
}
