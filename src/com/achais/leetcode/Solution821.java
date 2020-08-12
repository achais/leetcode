package com.achais.leetcode;

import java.util.Arrays;

public class Solution821 {
    public int[] shortestToChar(String S, char C) {
        int[] ans = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if ((i - j >= 0 && C == S.charAt(i - j)) || (i + j < S.length() && C == S.charAt(i + j))) {
                    ans[i] = j;
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';

        Solution821 solution = new Solution821();
        int[] stdout = solution.shortestToChar(S, C);

        System.out.println(Arrays.toString(stdout));
    }
}
