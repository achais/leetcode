package com.achais.leetcode;

import java.util.Arrays;

public class Solution905 {
    public int[] sortArrayByParity(int[] A) {
        int l = 0, r = A.length - 1;
        while (l < r) {
            while (l < r && A[l] % 2 == 0) {
                l++;
            }
            while (l < r && A[r] % 2 != 0) {
                r--;
            }

            if (l < r) {
                int t = A[l];
                A[l] = A[r];
                A[r] = t;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {0,2};

        Solution905 solution = new Solution905();
        int[] stdout = solution.sortArrayByParity(A);

        System.out.println(Arrays.toString(stdout));
    }
}
