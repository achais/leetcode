package com.achais.leetcode;

public class Solution171 {
    public int titleToNumber(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = (s.charAt(i) - 'A' + 1) + ans * 26;
        }
        return ans;
    }

    public static void main(String[] args) {
        String stdin = "AB";

        Solution171 solution = new Solution171();
        Integer stdout = solution.titleToNumber(stdin);

        System.out.println(stdout);
    }
}
