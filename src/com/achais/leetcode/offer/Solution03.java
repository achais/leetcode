package com.achais.leetcode.offer;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Solution03 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }
        return -1;
    }

    public int findRepeatNumber2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.getOrDefault(num, 0) == 1) {
                return num;
            }
            map.put(num, 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};

        Solution03 solution = new Solution03();
        Integer stdout = solution.findRepeatNumber(nums);

        System.out.println(stdout);
    }
}
