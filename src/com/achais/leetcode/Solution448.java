package com.achais.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new LinkedList<>();
        int n = 1;
        for (int num : nums) {
            if (num != n) {
                boolean flag = false;
                while (n < num) {
                    flag = true;
                    ans.add(n++);
                }
                if (flag) {
                    n++;
                }
            } else {
                n++;
            }
        }
        while (n <= nums.length) {
            ans.add(n++);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};

        Solution448 solution = new Solution448();
        List<Integer> stdout = solution.findDisappearedNumbers(nums);

        System.out.println(stdout);
    }
}
