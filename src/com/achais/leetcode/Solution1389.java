package com.achais.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        for(int i=0; i < index.length; i++) {
            if (i > index[i]) {
                int t = nums[i];
                for(int j = i-1; j >= index[i]; j--) {
                    nums[j+1] = nums[j];
                }
                nums[index[i]] = t;
            }
        }
        return nums;
    }

    public int[] createTargetArray2(int[] nums, int[] index) {
        List<Integer> list = new LinkedList<>();
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int j = 0;
        for (Integer integer : list) {
            target[j] = integer;
            j++;
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        Solution1389 solution = new Solution1389();
        int[] stdout = solution.createTargetArray(nums, index);

        System.out.println(Arrays.toString(stdout));
    }
}
