package com.achais.leetcode;

import java.util.Arrays;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        int i = 0, index = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
                if (index != i + 1) {
                    nums[i] = 0;
                }
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] stdin = {1,0};

        Solution283 solution = new Solution283();
        solution.moveZeroes(stdin);

        System.out.println(Arrays.toString(stdin));
    }
}
