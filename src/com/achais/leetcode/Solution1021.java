package com.achais.leetcode;

public class Solution1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        int cur = 0;
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            num += (chars[i] == '(') ? 1 : -1;
            if (num == 0) {
                sb.append(S, cur + 1, i);
                cur = i + 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String stdin = "()()";

        Solution1021 solution = new Solution1021();
        String stdout = solution.removeOuterParentheses(stdin);

        System.out.println(stdout);
    }
}
