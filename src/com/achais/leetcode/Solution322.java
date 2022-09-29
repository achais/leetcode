package com.achais.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        this.coins = coins;
        return dp(amount);
    }

    int[] coins;

    Map<Integer, Integer> memo = new HashMap<>();

    //自顶向下
    public int dp(int amount) {
        if (amount < 0) return -1;
        if (amount == 0) return 0;

        if (memo.get(amount) != null) {
            return memo.get(amount);
        }

        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subproblem = dp(amount - coin);
            //子问题无解跳过
            if (subproblem == -1) {
                continue;
            }
            res = Math.min(res, 1 + subproblem);
        }

        memo.put(amount, res != Integer.MAX_VALUE ? res : -1);

        return memo.get(amount);
    }

    public static void main(String[] args) {
        int[] coins = {186,419,83,408};
        int amount = 6249;

        Solution322 solution = new Solution322();
        Integer stdout = solution.coinChange(coins, amount);

        System.out.println(stdout);
    }
}
