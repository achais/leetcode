package com.achais.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : t.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (map.size() != map2.size()) {
            return false;
        }

        for (Character key : map.keySet()) {
            if (!map.get(key).equals(map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);

        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s = "ab", t = "ba";

        Solution242 solution = new Solution242();
        boolean stdout = solution.isAnagram(s, t);

        System.out.println(stdout);
    }
}
