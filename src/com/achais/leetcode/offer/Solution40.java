package com.achais.leetcode.offer;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/*
经典 TopK 问题
 */
public class Solution40 {
    /*
    解法3 堆, 前小用大根堆, 前大用小根堆
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // 默认是小根堆，实现大根堆需要重写一下比较器
        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int i : arr) {
            if (queue.size() < k) {
                queue.offer(i);
            } else if (i < queue.peek()) {
                queue.poll();
                queue.offer(i);
            }
        }

        int[] ans = new int[queue.size()];
        int index = 0;
        for (Integer integer : queue) {
            ans[index++] = integer;
        }
        return ans;
    }

    /*
    解法2
     */
    public int[] getLeastNumbers2(int[] arr, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i : arr) {
            queue.offer(i);
        }

        int[] ans = new int[k];

        int index = 0;
        while (k-- > 0) {
            ans[index++] = queue.poll();
        }
        return ans;
    }

    /*
    解法1 快排
     */
    public int[] getLeastNumbers1(int[] arr, int k) {
        int[] ans = new int[k];
        Arrays.sort(arr);
        int index = 0;
        while (index < k) {
            ans[index] = arr[index];
            index++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int k = 2;

        Solution40 solution = new Solution40();
        int[] stdout = solution.getLeastNumbers(arr, k);

        System.out.println(Arrays.toString(stdout));
    }
}
