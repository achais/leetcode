package com.achais.leetcode;

class NumArray303 {
    private int[] nums;

    public NumArray303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (i = i; i <= j; i++) {
            sum += this.nums[i];
        }
        return sum;
    }
}

public class Solution303 {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray303 obj = new NumArray303(nums);
        int param_1 = obj.sumRange(2, 5);
        System.out.println(param_1);
    }
}
