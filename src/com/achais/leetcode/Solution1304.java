package com.achais.leetcode;

import java.util.Arrays;

public class Solution1304 {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n - 1; i += 2) {
            ans[i] = +i + 1;
            ans[i + 1] = -i - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 20;

        Solution1304 solution = new Solution1304();
        int[] stdout = solution.sumZero(n);

        System.out.println(Arrays.toString(stdout));
    }
}
