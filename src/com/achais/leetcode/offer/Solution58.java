package com.achais.leetcode.offer;

import java.util.Arrays;

public class Solution58 {
    /*
    第二道 解法2
     */
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        s = s.trim();
        int i = s.length() - 1, j = i;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            ans.append(s.substring(i + 1, j + 1)).append(" ");
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }

        return ans.toString().trim();
    }

    /*
    第二道 解法1
     */
    public String reverseWords1(String s) {
        String[] arr = s.trim().split("\\s+");
        String t;
        int l = 0, r = arr.length - 1;
        while (l < r) {
            t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }

        return String.join(" ", arr);
    }

    /*
    第二道 解法1
     */
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        String stdin = "hello world ";
        int k = 2;

        Solution58 solution = new Solution58();
//        String stdout = solution.reverseLeftWords(stdin, k);
        String stdout = solution.reverseWords(stdin);

        System.out.println(stdout);
    }
}
