package com.achais.leetcode;

import java.util.Arrays;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        //记录字符上次出现的下标
        int[] last = new int[128];
        Arrays.fill(last, -1);

        int ans = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i);
            start = Math.max(start, last[ch] + 1);
            ans = Math.max(ans, i - start + 1);
            last[ch] = i; //上一次最后出现的下标
        }
        return ans;
    }

    public static void main(String[] args) {
        String stdin = "anhnhnjmmjfk";

        Solution3 solution = new Solution3();
        Integer stdout = solution.lengthOfLongestSubstring(stdin);

        System.out.println(stdout);
    }
}
