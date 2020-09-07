package com.achais.leetcode.offer;

public class Solution53 {
    /*
    解法1
     */
    public int search(int[] nums, int target) {
        // 搜索右边界
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] <= target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        int right = l;

        if (r >= 0 && nums[r] != target) {
            return 0;
        }

        // 搜索左边界
        l = 0;
        r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        int left = r;

        return right - left - 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5};
        int target = 4;

        Solution53 solution = new Solution53();
        Integer stdout = solution.search(nums, target);

        System.out.println(stdout);
    }
}
