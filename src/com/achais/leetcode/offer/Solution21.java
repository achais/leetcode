package com.achais.leetcode.offer;

import java.util.Arrays;

public class Solution21 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1, t;
        while (left < right) {
            while (left < right && (nums[left] & 1) == 1) {
                left++;
            }
            while (left < right && (nums[right] & 1) == 0) {
                right--;
            }
            t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        Solution21 solution = new Solution21();
        int[] stdout = solution.exchange(nums);

        System.out.println(Arrays.toString(stdout));
    }
}
