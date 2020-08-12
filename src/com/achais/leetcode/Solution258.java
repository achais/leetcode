package com.achais.leetcode;

public class Solution258 {
    public int addDigits(int num) {
        while (num >= 10) {
            int mod = num % 10;
            num = num / 10 + mod;
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 38;

        Solution258 solution = new Solution258();
        Integer stdout = solution.addDigits(num);

        System.out.println(stdout);
    }
}
