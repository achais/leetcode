package com.achais.leetcode;

public class Solution198 {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];
        if (length == 2) return Math.max(nums[0], nums[1]);
        int[] memo = new int[length+1];
        memo[0] = nums[0];
        memo[1] = Math.max(nums[0], nums[1]);
        for (int i=2; i<length; i++) {
            memo[i] = Math.max(memo[i-2] + nums[i], memo[i-1]);
        }
        return memo[length-1];
    }

    public static void main(String[] args) {
        int[] stdin = {2,7,9,3,1};
        //int[] stdin = {1,2,3,1};

        Solution198 solution = new Solution198();
        Integer stdout = solution.rob(stdin);

        System.out.println(stdout);
    }
}
