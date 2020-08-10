package com.achais.leetcode;

public class Solution557 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                r = i - 1;
                chars = reverseChars(chars, l, r);
                l = i + 1;
            } else if (i == chars.length - 1) {
                r = i;
                chars = reverseChars(chars, l, r);
            }
        }
        return String.valueOf(chars);
    }

    public char[] reverseChars(char[] chars, int l, int r) {
        for (int i = l; i < r; i++, r--) {
            char t = chars[i];
            chars[i] = chars[r];
            chars[r] = t;
        }
        return chars;
    }

    public static void main(String[] args) {
        String stdin = "Let's take LeetCode contest";

        Solution557 solution = new Solution557();
        String stdout = solution.reverseWords(stdin);

        System.out.println(stdout);
    }
}
