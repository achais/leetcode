package com.achais.leetcode;

public class Solution122 {
    /**
     * 累加上升阶段
     */
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                sum += prices[i] - prices[i - 1];
            }
        }
        return sum;
    }

    /**
     * 找峰谷
     */
    public int maxProfit2(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxProfit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxProfit += peak - valley;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stdin = {7, 1, 5, 3, 6, 4};

        Solution122 solution = new Solution122();
        Integer stdout = solution.maxProfit(stdin);

        System.out.println(stdout);
    }
}
