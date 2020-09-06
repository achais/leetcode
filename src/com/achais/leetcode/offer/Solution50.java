package com.achais.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

public class Solution50 {
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (map.getOrDefault(c, 0) == 1) {
                return c;
            }
        }
        return ' ';
    }

    public char firstUniqChar2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int index = Integer.MAX_VALUE;
        for (Character character : map.keySet()) {
            if (map.get(character) == 1) {
                index = Math.min(s.indexOf(character), index);
            }
        }

        return index == Integer.MAX_VALUE ? ' ' : s.charAt(index);
    }

    public static void main(String[] args) {
        String s = "leetcode";

        Solution50 solution = new Solution50();
        char stdout = solution.firstUniqChar(s);

        System.out.println(stdout);
    }
}
