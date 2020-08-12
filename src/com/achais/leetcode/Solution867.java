package com.achais.leetcode;

import java.util.Arrays;

public class Solution867 {
    public int[][] transpose(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        int[][] ans = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = A[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Solution867 solution = new Solution867();
        int[][] stdout = solution.transpose(A);

        System.out.println(Arrays.deepToString(stdout));
    }
}
