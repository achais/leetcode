package com.achais.leetcode;

public class Solution1332 {
    public int removePalindromeSub(String s) {
        boolean palindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                palindrome = false;
                break;
            }
        }
        if (s.length() > 0 && palindrome) return 1;
        int ans = 0;
        if (s.contains("a")) ans++;
        if (s.contains("b")) ans++;
        return ans;
    }

    public static void main(String[] args) {
        String stdin = "aaaabbbb";

        Solution1332 solution = new Solution1332();
        Integer stdout = solution.removePalindromeSub(stdin);

        System.out.println(stdout);
    }
}
