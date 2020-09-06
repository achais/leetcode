package com.achais.leetcode.offer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution57 {
    /*
    第一道
     */
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left != right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            }
            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[0];
    }

    /*
    第二道 解法1
     */
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new LinkedList<>();
        for (int a = 1; a <= target / 2; a++) {
            for (int n = 2; n < target; n++) {
                int sum = (a + a + n - 1) * n / 2;
                //符合公式的保存
                if (sum == target) {
                    int[] arr = new int[n];
                    for (int j = 0; j < n; j++) {
                        arr[j] = a + j;
                    }
                    list.add(arr);
                } else if (sum > target) {
                    break;
                }
            }
        }
        int[][] ans = new int[list.size()][];
        return list.toArray(ans);
    }

    /*
    第二道 解法2
     */
    public int[][] findContinuousSequence2(int target) {
        List<int[]> list = new LinkedList<>();
        for (int i = 1; i <= target / 2; i++) {
            int sum = 0;
            int n = 0;
            while (sum < target) {
                sum += (i + n++);
            }
            if (sum == target) {
                int[] arr = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = i + j;
                }
                list.add(arr);
            }
        }
        int[][] ans = new int[list.size()][];
        return list.toArray(ans);
    }

    public static void main(String[] args) {
        int target = 9;

        Solution57 solution = new Solution57();
        int[][] stdout = solution.findContinuousSequence(target);

        System.out.println(Arrays.deepToString(stdout));
    }
}
