package com.achais.leetcode;

public class Solution1217 {
    public int minCostToMoveChips(int[] chips) {
        int odd = 0, even = 0;
        for (int chip : chips) {
            if (chip % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(odd, even);
    }

    public static void main(String[] args) {
        int[] chips = {1, 2, 3};

        Solution1217 solution = new Solution1217();
        Integer stdout = solution.minCostToMoveChips(chips);

        System.out.println(stdout);
    }
}
