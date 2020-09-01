package com.achais.leetcode;

public class Solution1556 {
    public String thousandSeparator(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for (int i = sb.length() - 3; i > 0; i-=3) {
            sb.insert(i, '.');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int stdin = 1995003;

        Solution1556 solution = new Solution1556();
        String stdout = solution.thousandSeparator(stdin);

        System.out.println(stdout);
    }
}
