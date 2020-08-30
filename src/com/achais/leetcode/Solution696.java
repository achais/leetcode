package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution696 {
    public int countBinarySubstrings(String s) {
        List<Integer> list = new ArrayList<>();
        char c = s.charAt(0);
        for (int i = 0, k = 0; i < s.length(); i++) {
            if (c != s.charAt(i)) {
                list.add(i - k);
                c = s.charAt(i);
                k = i;
            }
            if (i == s.length() - 1) {
                list.add(i - k + 1);
            }
        }

        int ans = 0;
        for (int i = 1; i < list.size(); i++) {
            ans += Math.min(list.get(i), list.get(i - 1));
        }

        return ans;
    }

    public static void main(String[] args) {
        String stdin = "00110";

        Solution696 solution = new Solution696();
        Integer stdout = solution.countBinarySubstrings(stdin);

        System.out.println(stdout);
    }
}
