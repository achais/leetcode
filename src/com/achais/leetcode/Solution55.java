package com.achais.leetcode;

public class Solution55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        boolean[] memo = new boolean[nums.length];
        memo[0] = true;
        for (int i=1; i<nums.length; i++) {
            boolean can = false;
            for (int j=i-1; j>=0; j--) {
                if (memo[j] && nums[j] >= i-j) {
                    can = true;
                    break;
                }
            }
            memo[i] = can;
        }
        return memo[nums.length-1];
    }

    public boolean canJump2(int[] nums) {
        if (nums.length == 1) return true;
        if (nums[0] == 0) return false;
        for (int i=1; i<nums.length-1; i++) {
            if (nums[i] == 0) {
                int j=i-1;
                while (j>=0) {
                    if (nums[j] > i - j) {
                        j = Integer.MIN_VALUE;
                        break;
                    }
                    j--;
                }
                if (j == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] stdin = {2,3,1,1,4};
        int[] stdin = {2,0,0};

        Solution55 solution = new Solution55();
        boolean stdout = solution.canJump(stdin);

        System.out.println(stdout);
    }
}
