package com.achais.leetcode;

public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length+1];
        memo[0] = 0;
        memo[1] = 0;
        for (int i=2; i <= cost.length; i++) {
            memo[i] = Math.min(memo[i-1] + cost[i-1], memo[i-2] + cost[i-2]);
        }
        return memo[cost.length];
    }

    public static void main(String[] args) {
        int[] stdin = {1,100,1,1,1,100,1,1,100,1};
        //int[] stdin = {10,15, 20};

        Solution746 solution = new Solution746();
        Integer stdout = solution.minCostClimbingStairs(stdin);

        System.out.println(stdout);
    }
}
