package com.achais.leetcode.offer;

public class Solution63 {
    /*
    动态规划
     */
    public int maxProfit(int[] prices) {
        int profit = 0, cost = Integer.MAX_VALUE;
        for (int price : prices) {
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,4};

        Solution63 solution = new Solution63();
        Integer stdout = solution.maxProfit(prices);

        System.out.println(stdout);
    }
}
