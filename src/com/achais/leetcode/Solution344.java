package com.achais.leetcode;

public class Solution344 {
    public void reverseString(char[] s) {
        for (int i = 0, r = s.length - 1; i < r; i++, r--) {
            char t = s[i];
            s[i] = s[r];
            s[r] = t;
        }
    }

    public static void main(String[] args) {
        char[] stdin = "hello".toCharArray();

        Solution344 solution = new Solution344();
        solution.reverseString(stdin);

        System.out.println(stdin);
    }
}
