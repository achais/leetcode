package com.achais.leetcode.offer;

import java.util.Arrays;

public class Solution17 {
    public int[] printNumbers(int n) {
        int[] ans = new int[(int) (Math.pow(10, n) - 1)];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = i + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;

        Solution17 solution = new Solution17();
        int[] stdout = solution.printNumbers(n);

        System.out.println(Arrays.toString(stdout));
    }
}
