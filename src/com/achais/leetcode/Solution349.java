package com.achais.leetcode;

import java.util.*;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> ansSet = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                ansSet.add(i);
                set.remove(i);
            }
        }

        int[] ans = new int[ansSet.size()];
        int i = 0;
        for (Integer integer : ansSet) {
            ans[i++] = integer;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        Solution349 solution = new Solution349();
        int[] stdout = solution.intersection(nums1, nums2);

        System.out.println(Arrays.toString(stdout));
    }
}
