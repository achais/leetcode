package com.achais.leetcode;

import java.util.Arrays;

public class Solution1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] + arr[i + 1] != arr[i] * 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1};

        Solution1502 solution = new Solution1502();
        boolean stdout = solution.canMakeArithmeticProgression(arr);

        System.out.println(stdout);
    }
}
