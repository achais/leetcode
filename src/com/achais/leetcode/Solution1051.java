package com.achais.leetcode;

import java.util.Arrays;

public class Solution1051 {
    public int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);

        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};

        Solution1051 solution = new Solution1051();
        Integer stdout = solution.heightChecker(heights);

        System.out.println(stdout);
    }
}
