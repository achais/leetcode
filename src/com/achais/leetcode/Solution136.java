package com.achais.leetcode;

public class Solution136 {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public int singleNumber2(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[i] = nums[j] = 0;
                    break;
                }
            }
        }

        for (int num : nums) {
            if (num != 0) return num;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {-1};

        Solution136 solution = new Solution136();
        Integer stdout = solution.singleNumber(arr);

        System.out.println(stdout);
    }
}
