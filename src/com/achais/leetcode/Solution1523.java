package com.achais.leetcode;

public class Solution1523 {
    public int countOdds(int low, int high) {
        int res = 0;
        if ((low & 1) == 0) {
            low++;
        }
        if ((high & 1) == 1) {
            high--;
            res++;
        }
        return res + (high - low + 1) / 2;
    }

    public static void main(String[] args) {
        int low = 3, high = 7;

        Solution1523 solution = new Solution1523();
        Integer stdout = solution.countOdds(low, high);

        System.out.println(stdout);
    }
}
