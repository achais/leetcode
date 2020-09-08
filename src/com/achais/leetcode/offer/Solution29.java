package com.achais.leetcode.offer;

import java.util.Arrays;

public class Solution29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }

        int m = matrix.length, n = matrix[0].length;
        int[] ans = new int[m * n];
        int index = 0;
        int ml = 0, mr = n - 1, nt = 0, nb = m - 1;
        int vector = 0;
        int i = 0, j = 0;
        while (true) {
            if (index >= ans.length) {
                break;
            }
            ans[index++] = matrix[i][j];
            //System.out.println(matrix[i][j]);
            if ((ml == mr && nt == nb)) {
                break;
            }
            switch (vector) {
                case 0: // 右
                    if (j == mr) {
                        nt++;
                        i++;
                        vector = (vector + 1) % 4;
                    } else {
                        j++;
                    }
                    break;
                case 1: // 下
                    if (i == nb) {
                        mr--;
                        j--;
                        vector = (vector + 1) % 4;
                    } else {
                        i++;
                    }
                    break;
                case 2: // 左
                    if (j == ml) {
                        nb--;
                        i--;
                        vector = (vector + 1) % 4;
                    } else {
                        j--;
                    }
                    break;
                case 3: // 上
                    if (i == nt) {
                        ml++;
                        j++;
                        vector = (vector + 1) % 4;
                    } else {
                        i--;
                    }
                    break;
                default:
                    break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        Solution29 solution = new Solution29();
        int[] stdout = solution.spiralOrder(matrix);

        System.out.println(Arrays.toString(stdout));
    }
}
