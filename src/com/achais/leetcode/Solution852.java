package com.achais.leetcode;

public class Solution852 {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] stdin = {0, 1, 0};

        Solution852 solution = new Solution852();
        Integer stdout = solution.peakIndexInMountainArray(stdin);

        System.out.println(stdout);
    }
}
