package com.achais.leetcode;

public class Solution1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num + "").length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};

        Solution1295 solution = new Solution1295();
        int stdout = solution.findNumbers(nums);

        System.out.println(stdout);
    }
}
