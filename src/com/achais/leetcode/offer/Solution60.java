package com.achais.leetcode.offer;

import java.util.Arrays;

public class Solution60 {
    public double[] twoSum(int n) {
        double[] pre = {1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d};
        for (int i = 2; i <= n; i++) {
            double[] temp = new double[5 * i + 1];
            for (int j = 0; j < pre.length; j++) {
                for (int x = 0; x < 6; x++) {
                    temp[x + j] += pre[j] / 6;
                }
            }
            pre = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        int n = 2;

        Solution60 solution = new Solution60();
        double[] stdout = solution.twoSum(n);

        System.out.println(Arrays.toString(stdout));
    }
}
