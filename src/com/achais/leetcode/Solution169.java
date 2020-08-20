package com.achais.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution169 {
    public int majorityElement(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        int middle = nums.length / 2;
        for (Integer key : map.keySet()) {
            if (map.get(key) > middle) {
                return key;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        Solution169 solution = new Solution169();
        Integer stdout = solution.majorityElement(nums);

        System.out.println(stdout);
    }
}
