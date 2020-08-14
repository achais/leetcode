package com.achais.leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Solution496 {
    /**
     * 单调栈
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek())
                map.put(stack.pop(), num);
            stack.push(num);
        }
        while (!stack.isEmpty())
            map.put(stack.pop(), -1);
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }

    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int index = 0;
        for (int i : nums1) {
            boolean on = false;
            int val = -1;
            for (int i1 : nums2) {
                if (i1 == i) on = true;
                if (on && i1 > i) {
                    val = i1;
                    break;
                }
            }
            ans[index++] = val;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        Solution496 solution = new Solution496();
        int[] stdout = solution.nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(stdout));
    }
}
