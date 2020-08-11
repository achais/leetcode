package com.achais.leetcode;

public class Solution476 {
    public int findComplement(int num) {
        int xor = 1;
        while (xor < num) {
            xor <<= 1;
            xor++;
        }
        return xor ^ num;
    }

    public static void main(String[] args) {
        int num = 5;

        Solution476 solution = new Solution476();
        Integer stdout = solution.findComplement(num);

        System.out.println(stdout);
    }
}
