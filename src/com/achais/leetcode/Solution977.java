package com.achais.leetcode;

import java.util.Arrays;

public class Solution977 {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int[] A = {-4, -1, 0, 3, 10};

        Solution977 solution = new Solution977();
        int[] stdout = solution.sortedSquares(A);

        System.out.println(Arrays.toString(stdout));
    }
}
