package com.achais.leetcode;

import java.util.Arrays;

public class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ans += nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2, 5, 6};

        Solution561 solution = new Solution561();
        Integer stdout = solution.arrayPairSum(nums);

        System.out.println(stdout);
    }
}
