package com.achais.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] table = new int[m][n];
        List<Integer> ans = new ArrayList<>();

        // 横着查找
        for (int row = 0; row < m; row++) {
            int min = matrix[row][0];
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                }
            }
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == min) {
                    table[row][col] = min;
                }
            }
        }

        // 竖着查找
        for (int col = 0; col < n; col++) {
            int max = matrix[0][col];
            for (int row = 0; row < m; row++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                }
            }
            for (int row = 0; row < m; row++) {
                if (matrix[row][col] == max && table[row][col] > 0) {
                    ans.add(max);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        Solution1380 solution = new Solution1380();
        List<Integer> stdout = solution.luckyNumbers(matrix);

        System.out.println(stdout);
    }
}
