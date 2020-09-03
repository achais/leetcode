package com.achais.leetcode;

public class Solution121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public int maxProfit2(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                ans = Math.max(ans, prices[j] - prices[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};

        Solution121 solution = new Solution121();
        Integer stdout = solution.maxProfit(prices);

        System.out.println(stdout);
    }
}
