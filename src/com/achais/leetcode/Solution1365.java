package com.achais.leetcode;

import java.util.Arrays;

public class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int index = 0;
        for (int value : nums) {
            for (int num : nums) {
                if (num < value) {
                    ans[index]++;
                }
            }
            index++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        Solution1365 solution = new Solution1365();
        int[] stdout = solution.smallerNumbersThanCurrent(nums);

        System.out.println(Arrays.toString(stdout));
    }
}
