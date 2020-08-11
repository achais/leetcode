package com.achais.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
        }

        Set<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();
    }

    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};

        Solution1207 solution = new Solution1207();
        boolean stdout = solution.uniqueOccurrences(arr);

        System.out.println(stdout);
    }
}
