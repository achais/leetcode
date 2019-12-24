package com.achais.leetcode;

public class Solution58 {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int length = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                length++;
            } else if (length > 0){
                return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String stdin = "Hello World";

        Solution58 solution = new Solution58();
        Integer stdout = solution.lengthOfLastWord(stdin);

        System.out.println(stdout);
    }
}
