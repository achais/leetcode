package com.achais.leetcode;

public class Solution1528 {
    public String restoreString(String s, int[] indices) {
        char[] chars = s.toCharArray();
        char[] ans = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = chars[i];
        }
        return new String(ans);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        Solution1528 solution = new Solution1528();
        String stdout = solution.restoreString(s, indices);

        System.out.println(stdout);
    }
}
