package com.achais.leetcode;

import java.util.Arrays;

public class Solution1356 {
    public int[] sortByBits(int[] arr) {
        int[] ans = new int[arr.length];
        Arrays.sort(arr);
        int num = 0, index = 0;

        do {
            boolean pass = true;
            for (int i = 0; i < arr.length; i++) {
                if (Integer.bitCount(arr[i]) == num) {
                    pass = false;
                    ans[index++] = arr[i];
                    arr[i] = Integer.MAX_VALUE;
                }
            }
            if (pass) {
                num++;
            }
        } while (num <= 16);

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        Solution1356 solution = new Solution1356();
        int[] stdout = solution.sortByBits(arr);

        System.out.println(Arrays.toString(stdout));
    }
}
