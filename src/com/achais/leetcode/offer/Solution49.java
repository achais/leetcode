package com.achais.leetcode.offer;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Solution49 {
    /*
    解法2 动态规划
     */

    /*
    解法1 小根堆
     */
    public int nthUglyNumber(int n) {
        int[] arr = {2, 3, 5};
        Queue<Double> queue = new PriorityQueue<>();
        Set<Double> set = new HashSet<>();
        queue.offer((double) 1);
        set.add((double) 1);
        double ugly = 0;
        while (n-- > 0) {
            ugly = queue.poll();
            for (int i : arr) {
                if (!set.contains(i * ugly)) {
                    queue.offer(i * ugly);
                    set.add(i * ugly);
                }
            }
        }

        return (int)ugly;
    }

    public static void main(String[] args) {
        int n = 10;

        Solution49 solution = new Solution49();
        Integer stdout = solution.nthUglyNumber(n);

        System.out.println(stdout);
    }
}
