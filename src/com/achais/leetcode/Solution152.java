package com.achais.leetcode;

public class Solution152 {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int num : nums) {
            if (num < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax * num, num);
            imin = Math.min(imin * num, num);

            max = Math.max(max, imax);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] stdin = {2,3,-2,4};

        Solution152 solution = new Solution152();
        Integer stdout = solution.maxProduct(stdin);

        System.out.println(stdout);
    }
}
