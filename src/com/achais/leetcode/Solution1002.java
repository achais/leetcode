package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution1002 {
    public List<String> commonChars(String[] A) {
        List<String> ans = new ArrayList<>();
        char[][] table = new char[A.length][];
        int i = 0;
        for (String s : A) {
            table[i++] = s.toCharArray();
        }

        char[] rowOne = table[0];
        for (char c : rowOne) {
            boolean removeAll = true;
            for (int j = 1; j < table.length; j++) {
                if (!removeChar(table[j], c)) {
                    removeAll = false;
                    break;
                }
            }
            if (removeAll) {
                ans.add(String.valueOf(c));
            }
        }

        return ans;
    }

    public boolean removeChar(char[] chars, char c) {
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                chars[i] = '-';
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] stdin = {"cool","lock","cook"};

        Solution1002 solution = new Solution1002();
        List<String> stdout = solution.commonChars(stdin);

        System.out.println(stdout);
    }
}
