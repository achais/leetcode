package com.achais.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }

        int k = 0;
        int[] ans = new int[len];
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                ans[k] = nums[i + 1];
                k++;
            }
        }
        return ans;
    }

    public int[] decompressRLElist2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }

        int[] ans = new int[list.size()];
        int k = 0;
        for (Integer integer : list) {
            ans[k] = integer;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] stdin = {1, 2, 3, 4};

        Solution1313 solution = new Solution1313();
        int[] stdout = solution.decompressRLElist(stdin);

        System.out.println(Arrays.toString(stdout));
    }
}
