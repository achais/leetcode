package com.achais.leetcode;

//todo:未完成
public class Solution1567 {
    public int getMaxLen(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            nums[i] = Integer.compare(nums[i], 0);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] stdin = {1,-2,-3,4};

        Solution1567 solution = new Solution1567();
        Integer stdout = solution.getMaxLen(stdin);

        System.out.println(stdout);
    }
}
