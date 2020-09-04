package com.achais.leetcode;

public class Solution1446 {
    public int maxPower(String s) {
        int ans = 1;
        int power = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                power++;
            } else {
                ans = Math.max(ans, power);
                power = 1;
            }
        }
        return Math.max(ans, power);
    }

    public static void main(String[] args) {
        String stdin = "3c33333333333333c";

        Solution1446 solution = new Solution1446();
        Integer stdout = solution.maxPower(stdin);

        System.out.println(stdout);
    }
}
