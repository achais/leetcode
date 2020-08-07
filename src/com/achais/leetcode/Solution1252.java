package com.achais.leetcode;

public class Solution1252 {
    public int oddCells(int n, int m, int[][] indices) {
        int[] row = new int[n];
        int[] col = new int[m];

        for (int[] item : indices) {
            row[item[0]] ^= 1;
            col[item[1]] ^= 1;
        }

        int rowNum = 0, colNum = 0;

        for (int i : row) {
            if (i == 1) {
                rowNum++;
            }
        }

        for (int i : col) {
            if (i == 1) {
                colNum++;
            }
        }

        return rowNum * m + colNum * n - rowNum * colNum * 2;
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] indices = {{0, 1}, {1, 1}};

        Solution1252 solution = new Solution1252();
        Integer stdout = solution.oddCells(n, m, indices);

        System.out.println(stdout);
    }
}
