package com.achais.leetcode;

import java.util.Arrays;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        // 预留一个进位
        int add = 0;
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += add;
            if (digits[i] >= 10) {
                digits[i] = digits[i] - 10;
                add = 1;
            } else {
                add = 0;
            }
        }

        // 最后还有进位
        if (add == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] stdin = {8,9,9,9};

        Solution66 solution = new Solution66();
        int[] stdout = solution.plusOne(stdin);
        System.out.println(Arrays.toString(stdout));
    }
}
