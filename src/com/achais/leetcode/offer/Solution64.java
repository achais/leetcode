package com.achais.leetcode.offer;

/*
逻辑符短路原理
 */
public class Solution64 {
    public int sumNums(int n) {
        return an(n);
    }

    public int an(int n) {
        int ans = 1;
        boolean one = n == 1;
        boolean flag  = (!one && (0 < (ans = an(n - 1) + n)));
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;

        Solution64 solution = new Solution64();
        Integer stdout = solution.sumNums(n);

        System.out.println(stdout);
    }
}
