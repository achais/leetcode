package com.achais.leetcode;

import java.util.Arrays;

public class Solution1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int size = 0;
        for (int i : arr2) {
            for (int j = 0; j < arr1.length; j++) {
                if (i == arr1[j]) {
                    ans[size++] = arr1[j];
                    arr1[j] = 2000;
                }
            }
        }
        Arrays.sort(arr1);
        for (int k = 0; size < arr1.length; k++) {
            ans[size++] = arr1[k];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};

        Solution1122 solution = new Solution1122();
        int[] stdout = solution.relativeSortArray(arr1, arr2);

        System.out.println(Arrays.toString(stdout));
    }
}
