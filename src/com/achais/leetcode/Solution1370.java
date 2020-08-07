package com.achais.leetcode;

public class Solution1370 {
    public String sortString(String s) {
        char[] chars = s.toCharArray();
        int[] table = new int[26];

        for (char aChar : chars) {
            table[aChar - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        while (sb.length() < chars.length) {
            for (int i = 0; i < table.length; i++) {
                if (table[i] > 0) {
                    sb.append((char)(i + 'a'));
                    table[i]--;
                }
            }
            for (int i = table.length - 1; i >= 0; i--) {
                if (table[i] > 0) {
                    sb.append((char)(i + 'a'));
                    table[i]--;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String stdin = "aaaabbbbcccc";

        Solution1370 solution = new Solution1370();
        String stdout = solution.sortString(stdin);

        System.out.println(stdout);
    }
}
