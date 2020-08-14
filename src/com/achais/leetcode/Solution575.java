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

        int middle = candies.length / 2;
        System.out.println(middle);

        int[] values = new int[map.size()];
        int index = 0;
        for (Integer value : map.values()) {
            values[index++] = value;
        }

        Arrays.sort(values);
//        int sister = 0;
//        for (int i = 0; i < values.length; i++) {
//            sister += values[i];
//            if (sister >= middle) {
//                return i + 1;
//            }
//        }
        return 0;
    }

    public static void main(String[] args) {
        int[] candies = {1, 1, 2, 2, 3, 3};

        Solution575 solution = new Solution575();
        Integer stdout = solution.distributeCandies(candies);

        System.out.println(stdout);
    }
}
