package com.achais.leetcode;

public class Solution521 {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }

        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {
        String a = "234";
        String b = "sdf";

        Solution521 solution = new Solution521();
        Integer stdout = solution.findLUSlength(a, b);

        System.out.println(stdout);
    }
}
