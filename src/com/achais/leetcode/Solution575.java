package com.achais.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution575 {
    public int distributeCandies(int[] candies) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int candy : candies) {
            map.merge(candy, 1, Integer::sum);
        }

        //如果种类小于等于糖果数一半就等于种类
        return Math.min(map.keySet().size(), candies.length / 2);
    }

    public static void main(String[] args) {
        int[] candies = {1, 1, 2, 2, 3, 3};

        Solution575 solution = new Solution575();
        Integer stdout = solution.distributeCandies(candies);

        System.out.println(stdout);
    }
}
