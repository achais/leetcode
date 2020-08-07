package com.achais.leetcode;

public class Solution1323 {
    public int maximum69Number(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(chars));
    }

    public int maximum69Number2 (int num) {
        return Integer.parseInt((num + "").replaceFirst("6", "9"));
    }

    public static void main(String[] args) {
        int num = 9669;

        Solution1323 solution = new Solution1323();
        Integer stdout = solution.maximum69Number(num);

        System.out.println(stdout);
    }
}
