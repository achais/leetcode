package com.achais.leetcode.offer;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }

        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int j = 0, i = 1 - k; j < nums.length; i++, j++) {
            // 删除 deque 中对应的 nums[i-1]
            if (i > 0 && deque.peekFirst() == nums[i-1]) {
                deque.removeFirst();
            }
            // 保持 deque 递减
            while (!deque.isEmpty() && deque.peekLast() < nums[j]) {
                deque.removeLast();
            }
            deque.addLast(nums[j]);
            if(i >= 0) {
                ans[i] = deque.peekFirst();
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        Solution59 solution = new Solution59();
        int[] stdout = solution.maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(stdout));
    }
}
