package com.achais.leetcode;

public class Solution389 {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for (char c : t.toCharArray()) {
            sum += c;
        }
        for (char c : s.toCharArray()) {
            sum -= c;
        }

        return (char)(sum);
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        Solution389 solution = new Solution389();
        char stdout = solution.findTheDifference(s, t);

        System.out.println(stdout);
    }
}
