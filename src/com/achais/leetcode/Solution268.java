package com.achais.leetcode;

import java.util.Arrays;

public class Solution268 {
    /*
    解法2 数学
     */
    public int missingNumber1(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    /*
    解法1 排序二分查找, 排序耗时了
     */
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == m) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
//        int[] nums = {0, 2, 3};
//        int[] nums = {2, 1};
//        int[] nums = {0, 1};

        Solution268 solution = new Solution268();
        Integer stdout = solution.missingNumber(nums);

        System.out.println(stdout);
    }
}
