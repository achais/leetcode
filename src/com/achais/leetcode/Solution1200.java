package com.achais.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i] - arr[i-1], min);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] == min) {
                Integer[] a = {arr[i-1], arr[i]};
                ans.add(Arrays.asList(a));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};

        Solution1200 solution = new Solution1200();
        List<List<Integer>> stdout = solution.minimumAbsDifference(arr);

        System.out.println(stdout);
    }
}
