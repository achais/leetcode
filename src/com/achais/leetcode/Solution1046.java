package com.achais.leetcode;

import java.util.*;

class MyComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b.compareTo(a);
    }
}

public class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(new MyComparator());
        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() >= 2) {
            int newStone = queue.poll() - queue.poll();
            queue.offer(newStone);
        }

        return queue.poll();
    }

    public int lastStoneWeight2(int[] stones) {
        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> tempDeque = new LinkedList<>();
        Arrays.sort(stones);
        for (int stone : stones) {
            deque.push(stone);
        }

        while (deque.size() > 1) {
            int newStone = deque.pop() - deque.pop();
            while (deque.size() > 0 && deque.peek() > newStone) {
                tempDeque.push(deque.pop());
            }
            deque.push(newStone);
            while (tempDeque.size() > 0) {
                deque.push(tempDeque.pop());
            }
        }

        return deque.pop();
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};

        Solution1046 solution = new Solution1046();
        Integer stdout = solution.lastStoneWeight(stones);

        System.out.println(stdout);
    }
}
