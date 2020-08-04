package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        System.out.println(max);
        for (int i = 0; i < candies.length; i++) {
            ans.add(candies[i] + extraCandies >= max);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        Solution1431 solution = new Solution1431();
        List<Boolean> stdout = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(stdout);
    }
}
