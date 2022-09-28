package com.achais.leetcode;

public class Solution8 {
    public int myAtoi(String s) {


        int ans = 0;
        int ascii0 = 48;
        boolean fu = false;
        boolean prefix = true;
        for (byte aByte : s.getBytes()) {
            if (prefix) {
                if (aByte == ' ') {
                    continue;
                } else if (aByte == '-') {
                    fu = true;
                    prefix = false;
                    continue;
                } else if (aByte == '+') {
                    prefix = false;
                    continue;
                } else {
                    prefix = false;
                }
            }
            int value = aByte - ascii0;
            if (value >= 0 && value <= 9) {
                if (fu) {
                    if ((Integer.MIN_VALUE + value) / 10 > ans) {
                        ans = Integer.MIN_VALUE;
                    } else {
                        ans = ans * 10 - value;
                    }
                } else {
                    if ((Integer.MAX_VALUE - value) / 10 < ans) {
                        ans = Integer.MAX_VALUE;
                    } else {
                        ans = ans * 10 + value;
                    }
                }
            } else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String stdin = "-91283472332";

        Solution8 solution = new Solution8();
        Integer stdout = solution.myAtoi(stdin);

        System.out.println(stdout);
    }
}
