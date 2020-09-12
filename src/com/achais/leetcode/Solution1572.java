package com.achais.leetcode;

public class Solution1572 {
    public int diagonalSum(int[][] mat) {
        int N = mat.length, sum = 0;
        int i = 0, j = mat.length - 1;
        for (int n = 0; n < N && i < mat.length && j > -1; n++) {
            sum += mat[i++][n];
            sum += mat[j--][n];
        }
        if ((N & 1) == 1) {
            sum -= mat[N / 2][N / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{5}};

        Solution1572 solution = new Solution1572();
        Integer stdout = solution.diagonalSum(mat);

        System.out.println(stdout);
    }
}
