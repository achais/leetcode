package com.achais.leetcode;

import java.util.Arrays;

public class Solution942 {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int[] ans = new int[N + 1];
        int low = 0, heigh = N;

        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I') {
                ans[i] = low++;
            } else {
                ans[i] = heigh--;
            }
        }
        ans[N] = low;
        return ans;
    }

    public static void main(String[] args) {
        String stdin = "IDID";

        Solution942 solution = new Solution942();
        int[] stdout = solution.diStringMatch(stdin);

        System.out.println(Arrays.toString(stdout));
    }
}
