package com.achais.leetcode;

public class Solution1009 {
    public int bitwiseComplement(int N) {
        int N2 = 0b10;
        while (N2 <= N) N2 <<= 1;
        return N ^ (N2 -1);
    }

    public int bitwiseComplement2(int N) {
        int len = 2;
        while (Math.pow(2, len - 1) <= N) {
            len++;
        }
        return N ^ ((int) (Math.pow(2, len - 1)) -1);
    }

    public static void main(String[] args) {
        int N = 0;

        Solution1009 solution = new Solution1009();
        Integer stdout = solution.bitwiseComplement(N);

        System.out.println(stdout);
    }
}
