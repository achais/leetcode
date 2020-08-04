package com.achais.leetcode;

public class Solution1281 {
    public int subtractProductAndSum(int n) {
        int ji = 1, he = 0;
        while (n > 0) {
            ji *= n % 10;
            he += n % 10;
            n /= 10;
        }
        return ji - he;
    }

    public static void main(String[] args) {
        int n = 234;

        Solution1281 solution = new Solution1281();
        Integer stdout = solution.subtractProductAndSum(n);

        System.out.println(stdout);
    }
}
