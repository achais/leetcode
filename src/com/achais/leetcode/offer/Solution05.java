package com.achais.leetcode.offer;

public class Solution05 {
    public String replaceSpace(String s) {
        while (s.contains(" ")) {
            s = s.replace(" ", "%20");
        }
        return s;
    }

    public static void main(String[] args) {
        String stdin = "Hello World";

        Solution05 solution = new Solution05();
        String stdout = solution.replaceSpace(stdin);

        System.out.println(stdout);
    }
}
