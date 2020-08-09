package com.achais.leetcode;

public class Solution1374 {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            sb.append('a');
        }
        if (n % 2 == 1) {
            sb.append('a');
        } else {
            sb.append('b');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 1;

        Solution1374 solution = new Solution1374();
        String stdout = solution.generateTheString(n);

        System.out.println(stdout);
    }
}
