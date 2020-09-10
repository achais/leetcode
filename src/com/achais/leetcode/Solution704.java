package com.achais.leetcode;

public class Solution704 {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 12;

        Solution704 solution = new Solution704();
        Integer stdout = solution.search(nums, target);

        System.out.println(stdout);
    }
}
