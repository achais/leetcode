package com.achais.leetcode;

import java.util.Arrays;

public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if (row * col != r * c) {
            return nums;
        }

        int[][] ans = new int[r][c];
        int index = 0;
        for (int[] num : nums) {
            for (int i : num) {
                ans[index/c][index % c] = i;
                index++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;

        Solution566 solution = new Solution566();
        int[][] stdout = solution.matrixReshape(nums, r, c);

        System.out.println(Arrays.deepToString(stdout));
    }
}
