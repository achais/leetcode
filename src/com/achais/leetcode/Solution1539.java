package com.achais.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution1539 {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        int i = 0;
        while (k > 0) {
            if (!set.contains(++i)) {
                k--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 7, 10, 11};
        int k = 1;

        Solution1539 solution = new Solution1539();
        Integer stdout = solution.findKthPositive(arr, k);

        System.out.println(stdout);
    }
}
