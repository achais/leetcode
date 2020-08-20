package com.achais.leetcode;

import java.util.Arrays;

public class Solution1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int[] row = new int[mat.length];
        int index = 0;
        for (int[] ints : mat) {
            row[index++] = sumRow(ints);
        }

        int size = 0;
        int n = mat[0].length;
        here:
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] == j) {
                    ans[size++] = i;
                    row[i] = -1;
                    if (size == k) {
                        break here;
                    }
                }
            }
        }

        return ans;
    }

    public int sumRow(int[] arr) {
        int ans = 0;
        for (int i : arr) {
            if (i == 0) {
                break;
            }
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int k = 3;

        Solution1337 solution = new Solution1337();
        int[] stdout = solution.kWeakestRows(mat, k);

        System.out.println(Arrays.toString(stdout));
    }
}
