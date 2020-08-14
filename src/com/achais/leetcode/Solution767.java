package com.achais.leetcode;

public class Solution767 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int x = 1; x < matrix.length; x++) {
            for (int y = 1; y < matrix[0].length; y++) {
                if (matrix[x][y] != matrix[x-1][y-1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };

        Solution767 solution = new Solution767();
        boolean stdout = solution.isToeplitzMatrix(matrix);

        System.out.println(stdout);
    }
}
