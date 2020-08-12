package com.achais.leetcode;

import java.util.*;

public class Solution1394 {
    public int findLucky(int[] arr) {
        int ans = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
        }

        int max = ans;
        for (Integer key: map.keySet()) {
            if (key.equals(map.get(key)) && key > max) {
                ans = key;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};

        Solution1394 solution = new Solution1394();
        Integer stdout = solution.findLucky(arr);

        System.out.println(stdout);
    }
}
