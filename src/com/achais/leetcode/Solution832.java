package com.achais.leetcode;

import java.util.Arrays;

public class Solution832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int j = 0; j < A.length; j++) {
            for (int i = 0; i < (A[j].length + 1) / 2; i++) {
                int temp = 1 ^ A[j][i];
                A[j][i] = 1 ^ A[j][A[j].length - i - 1];
                A[j][A[j].length - i - 1] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        Solution832 solution = new Solution832();
        int[][] stdout = solution.flipAndInvertImage(A);

        System.out.println(Arrays.deepToString(stdout));
    }
}
