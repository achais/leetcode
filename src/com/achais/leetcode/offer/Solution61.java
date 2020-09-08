package com.achais.leetcode.offer;

import java.util.Arrays;

public class Solution61 {
    /*
    解法2 max - min < 5
     */
    public boolean isStraight(int[] nums) {
        int joker = 0;
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) {
                joker++;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        // 最大 - 最小 < 5
        return nums[4] - nums[joker] < 5;
    }

    /*
    解法1 模拟
     */
    public boolean isStraight1(int[] nums) {
        int zero = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            if (num == 0) {
                zero++;
            }
        }
        int hope = nums[zero] + 1;
        for (int i = zero + 1; i < nums.length; i++, hope++) {
            if (nums[i] != hope) {
                if (!(zero-- > 0)) {
                    return false;
                } else {
                    i--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 2, 2, 5};

        Solution61 solution = new Solution61();
        boolean stdout = solution.isStraight(nums);

        System.out.println(stdout);
    }
}
