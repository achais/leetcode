package com.achais.leetcode;

public class Solution1351 {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt < 0) ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};

        Solution1351 solution = new Solution1351();
        Integer stdout = solution.countNegatives(grid);

        System.out.println(stdout);
    }
}
