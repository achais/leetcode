package com.achais.leetcode.offer;

/*
二分查找法 分开2个升序数组, 根据中间值和右边值判断, 来推算范围
 */
public class Solution11 {
    public int minArray(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (nums[m] > nums[j]) {
                i = m + 1;
            } else if (nums[m] < nums[j]) {
                j = m;
            } else {
                j--;
            }
        }
        return nums[i];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8, 0, 2, 3};

        Solution11 solution = new Solution11();
        Integer stdout = solution.minArray(nums);

        System.out.println(stdout);
    }
}
