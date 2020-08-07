package com.achais.leetcode;

import java.util.Arrays;

public class Solution1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) return false;

        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }

    public static void main(String[] args) {
        int[] target = {2, 1, 3, 4};
        int[] arr = {2, 4, 1, 3};

        Solution1460 solution = new Solution1460();
        boolean stdout = solution.canBeEqual(target, arr);

        System.out.println(stdout);
    }
}
