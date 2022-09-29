package com.achais.leetcode;

public class Solution213 {
    //房子是围成圈的
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] num1 = nums.clone();
        num1[num1.length-1] = 0;
        int[] num2 = nums.clone();
        num2[0] = 0;
        return Math.max(subrob(num1), subrob(num2));
    }

    public int subrob(int[] nums) {
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
        int[] stdin = {1,6};

        Solution213 solution = new Solution213();
        Integer stdout = solution.rob(stdin);

        System.out.println(stdout);
    }
}
