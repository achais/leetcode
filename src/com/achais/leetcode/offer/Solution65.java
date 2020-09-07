package com.achais.leetcode.offer;

public class Solution65 {
    public int add(int a, int b) {
        int n, c;
        while (b != 0) {
            n = a ^ b; // 未进位和
            c = (a & b) << 1; // 进位
            a = n;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 111, b = 899;

        Solution65 solution = new Solution65();
        Integer stdout = solution.add(a, b);

        System.out.println(stdout);
    }
}
