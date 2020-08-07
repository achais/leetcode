package com.achais.leetcode;

public class Solution1309 {
    public String freqAlphabets(String s) {
        char[] chars = s.toCharArray();
        char[] table = "_abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i + 2 < chars.length && chars[i + 2] == '#') {
                sb.append(table[Integer.parseInt(String.valueOf(new char[]{chars[i], chars[i+1]}))]);
                i+=2;
            } else {
                sb.append(table[Integer.parseInt(String.valueOf(chars[i]))]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String stdin = "1326#";

        Solution1309 solution = new Solution1309();
        String stdout = solution.freqAlphabets(stdin);

        System.out.println(stdout);
    }
}
