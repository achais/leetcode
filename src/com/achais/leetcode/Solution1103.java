package com.achais.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        int number = 1;
        while (candies > 0) {
            number = Math.min(number, candies);
            candies -= number;
            ans[(i++) % num_people] += number++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int candies = 10;
        int num_people = 3;

        Solution1103 solution = new Solution1103();
        int[] stdout = solution.distributeCandies(candies, num_people);

        System.out.println(Arrays.toString(stdout));
    }
}
