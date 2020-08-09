package com.achais.leetcode;

import java.util.Arrays;

public class Solution1475 {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int k = i + 1;
            while (k < prices.length && prices[k] > prices[i]) {
                k++;
            }

            if (k == prices.length) {
                ans[i] = prices[i];
            } else {
                ans[i] = prices[i] - prices[k];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};

        Solution1475 solution = new Solution1475();
        int[] stdout = solution.finalPrices(prices);

        System.out.println(Arrays.toString(stdout));
    }
}
