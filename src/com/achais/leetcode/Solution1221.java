package com.achais.leetcode;

public class Solution1221 {
    public int balancedStringSplit(String s) {
        int ans = 0, num = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            num += (aChar == 'L') ? 1 : -1;
            if (num == 0) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String stdin = "RLRRLLRLRL";

        Solution1221 solution = new Solution1221();
        Integer stdout = solution.balancedStringSplit(stdin);

        System.out.println(stdout);
    }
}
