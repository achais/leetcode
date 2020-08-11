package com.achais.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0, middle = 0;
        for (int num : nums) {
            sum += num;
        }
        middle = sum / 2;
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            ans.add(nums[i]);
            if (sum > middle) {
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,4,7,6,7};

        Solution1403 solution = new Solution1403();
        List<Integer> stdout = solution.minSubsequence(nums);

        System.out.println(stdout);
    }
}
