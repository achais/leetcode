package com.achais.leetcode;

import java.util.Arrays;

/**
 * 逆序遍历
 */
public class Solution1299 {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int rightMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[i] = rightMax;
            if (arr[i] > rightMax) {
                rightMax = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};

        Solution1299 solution = new Solution1299();
        int[] stdout = solution.replaceElements(arr);

        System.out.println(Arrays.toString(stdout));
    }
}
