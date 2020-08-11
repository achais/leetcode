package com.achais.leetcode;

public class Solution1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int balance = 0;
        int ans = 0;
        while (numBottles > 0 || balance >= numExchange) {
            // 喝啤酒
            ans += numBottles;
            balance+= numBottles;
            numBottles = 0;
            // 换啤酒
            numBottles = balance / numExchange;
            balance = balance % numExchange;
        }
        return ans;
    }

    public static void main(String[] args) {
        int numBottles = 5;
        int numExchange = 5;

        Solution1518 solution = new Solution1518();
        Integer stdout = solution.numWaterBottles(numBottles, numExchange);

        System.out.println(stdout);
    }
}
