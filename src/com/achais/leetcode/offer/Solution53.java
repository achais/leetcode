package com.achais.leetcode.offer;

public class Solution53 {
    /*
    第二道 解法2 二分查找优化
     */
    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            // 相同右边缺, 不同左边缺
            if (nums[m] == m) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    /*
    第二道 解法1 二分查找
     */
    public int missingNumber1(int[] nums) {
        int n = nums.length + 1;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int l = 0, r = n - 1;
        int m = 0;
        while (r - l > 2) {
            m = (l + r) / 2;
            // 相同右边缺, 不同左边缺
            if (nums[m] == arr[m]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        for (int i = l; i < r; i++) {
            if (nums[i] != arr[i]) {
                return arr[i];
            }
        }

        return arr[r];
    }

    /*
    第一道 解法1
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
//        int[] nums = {1, 5};
        int target = 4;

        Solution53 solution = new Solution53();
//        Integer stdout = solution.search(nums, target);

//        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        int[] nums = {0, 2, 3};
        Integer stdout = solution.missingNumber(nums);

        System.out.println(stdout);
    }
}
