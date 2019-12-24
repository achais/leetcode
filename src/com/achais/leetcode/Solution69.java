package com.achais.leetcode;

public class Solution69 {
    public int mySqrt(int x) {
        // sqrt2 = (sqrt + x / sqrt) / 2
        int sqrt = 0;
        return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        int stdin = 10;

        Solution69 solution = new Solution69();
        Integer stdout = solution.mySqrt(stdin);

        System.out.println(stdout);
    }
}
