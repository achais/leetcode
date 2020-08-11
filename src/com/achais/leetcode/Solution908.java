package com.achais.leetcode;

public class Solution908 {
    public int smallestRangeI(int[] A, int K) {
        int min = A[0], max = A[0];
        for (int x : A) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return Math.max(0, max - min - 2 * K);
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 6};
        int K = 2;

        Solution908 solution = new Solution908();
        Integer stdout = solution.smallestRangeI(A, K);

        System.out.println(stdout);
    }
}
