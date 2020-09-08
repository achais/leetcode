package com.achais.leetcode.offer;

public class Solution04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int n = matrix[0].length;
        int r = n - 1;
        for (int[] ints : matrix) {
            for (int j = 0; j <= r; j++) {
                if (ints[j] == target) {
                    return true;
                } else if (target < ints[j]) {
                    r = j;
                    break;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 32;
//        int target = 20;

        Solution04 solution = new Solution04();
        boolean stdout = solution.findNumberIn2DArray(matrix, target);

        System.out.println(stdout);
    }
}
