package com.achais.leetcode;

public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};

        Solution1512 solution = new Solution1512();
        int stdout = solution.numIdenticalPairs(nums);
        System.out.println(stdout);
    }
}
