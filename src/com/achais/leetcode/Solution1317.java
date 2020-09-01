package com.achais.leetcode;

import java.util.Arrays;

public class Solution1317 {
    public int[] getNoZeroIntegers(int n) {
        int i = 1;
        while (i <= n / 2) {
            if (notZero(i) && notZero(n - i)) {
                return new int[]{i, n - i};
            }
            i++;
        }
        return new int[]{};
    }

    public boolean notZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 1010;

        Solution1317 solution = new Solution1317();
        int[] stdout = solution.getNoZeroIntegers(n);

        System.out.println(Arrays.toString(stdout));
    }
}
