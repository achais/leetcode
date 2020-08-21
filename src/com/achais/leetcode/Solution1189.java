package com.achais.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1189 {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : text.toCharArray()) {
            if ("balloon".contains(String.valueOf(c))) {
                map.merge(c, 1, Integer::sum);
            }
        }

        int[] arr = {
                map.getOrDefault('b', 0),
                map.getOrDefault('a', 0),
                map.getOrDefault('l', 0) / 2,
                map.getOrDefault('o', 0) / 2,
                map.getOrDefault('n', 0),
        };
        int ans = Integer.MAX_VALUE;
        for (int i : arr) {
            ans = Math.min(ans, i);
        }

        return ans;
    }

    public static void main(String[] args) {
        String stdin = "loonbalxballpoon";

        Solution1189 solution = new Solution1189();
        Integer stdout = solution.maxNumberOfBalloons(stdin);

        System.out.println(stdout);
    }
}
