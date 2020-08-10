package com.achais.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 队列的使用
 */
class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}

public class Solution933 {
    public List<Integer> run() {
        RecentCounter obj = new RecentCounter();
        List<Integer> ans = new ArrayList<>();
        ans.add(obj.ping(1));
        ans.add(obj.ping(1));
        ans.add(obj.ping(1));
        ans.add(obj.ping(1));
        return ans;
    }

    public static void main(String[] args) {
        Solution933 solution = new Solution933();
        List<Integer> stdout = solution.run();

        System.out.println(stdout);
    }
}
