package com.achais.leetcode;

public class Solution740 {
    public int deleteAndEarn(int[] nums) {
        int[] list = new int[10001];
        for (int num : nums) {
            list[num] += num;
        }

        return rob(list);
    }

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
        //int[] stdin = {3,4,2};
        int[] stdin = {2,2,3,3,3,4};

        Solution740 solution = new Solution740();
        Integer stdout = solution.deleteAndEarn(stdin);

        System.out.println(stdout);
    }
}
