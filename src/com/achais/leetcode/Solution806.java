package com.achais.leetcode;

import java.util.Arrays;

public class Solution806 {
    public int[] numberOfLines(int[] widths, String S) {
        int lines = 1;
        int line = 0;
        for (char c : S.toCharArray()) {
            line += widths[c - 'a'];
            while (line > 100) {
                lines++;
                line = widths[c - 'a'];
            }
        }
        return new int[]{lines, line};
    }

    public static void main(String[] args) {
        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String S = "bbbcccdddaaa";

        Solution806 solution = new Solution806();
        int[] stdout = solution.numberOfLines(widths, S);

        System.out.println(Arrays.toString(stdout));
    }
}
