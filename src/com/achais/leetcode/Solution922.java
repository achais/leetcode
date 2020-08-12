package com.achais.leetcode;

import java.util.Arrays;

public class Solution922 {
    public int[] sortArrayByParityII(int[] A) {
        int[] a = new int[A.length / 2];
        int[] b = new int[A.length / 2];
        int odd = 0, even = 0;
        for (int i : A) {
            if (i % 2 == 1) {
                b[even++] = i;
            } else {
                a[odd++] = i;
            }
        }

        int[] ans = new int[A.length];
        for (int i = 0; i < A.length / 2; i++) {
            ans[2 * i] = a[i];
            ans[2 * i + 1] = b[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {4, 2, 5, 7};

        Solution922 solution = new Solution922();
        int[] stdout = solution.sortArrayByParityII(A);

        System.out.println(Arrays.toString(stdout));
    }
}
