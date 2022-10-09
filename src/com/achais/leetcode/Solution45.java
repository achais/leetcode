package com.achais.leetcode;

import java.util.Arrays;

public class Solution45 {
    public int jump(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, nums.length - 1);
        memo[0] = 0;
        for (int i=1; i<nums.length; i++) {
            for (int j=0; j<i; j++) {
                if (nums[j] >= i - j) {
                    memo[i] = Math.min(memo[i], memo[j] + 1);
                }
            }
        }
        //System.out.println(Arrays.toString(memo));
        return memo[nums.length-1];
    }

    public static void main(String[] args) {
//        int[] stdin = {2,3,1,1,4};
//        int[] stdin = {2,3,0,1,4};
        int[] stdin = {2, 3};

        Solution45 solution = new Solution45();
        int stdout = solution.jump(stdin);

        System.out.println(stdout);
    }
}
