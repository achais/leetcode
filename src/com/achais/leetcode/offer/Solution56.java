package com.achais.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

public class Solution56 {
    /*
    第二道 解法1
     */
    public int[] singleNumbers(int[] nums) {
        int[] ans = new int[2];
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                ans[index++] = key;
                if (index == 2) {
                    break;
                }
            }
        }
        return ans;
    }

    /*
    第一道 解法1
     */
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {9, 1, 7, 9, 7, 9, 7};

        Solution56 solution = new Solution56();
        Integer stdout = solution.singleNumber(nums);

        System.out.println(stdout);
    }
}
