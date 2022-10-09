package com.achais.leetcode;

public class Solution53 {
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

    public static void main(String[] args) {
//        int[] stdin = {-2,1,-3,4,-1,2,1,-5,4};
        int[] stdin = {-2};

        Solution53 solution = new Solution53();
        Integer stdout = solution.maxSubArray(stdin);

        System.out.println(stdout);
    }
}
