package com.achais.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution961 {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int N = A.length / 2;
        for (int i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer) == N) {
                return integer;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 2, 5, 3, 2};

        Solution961 solution = new Solution961();
        Integer stdout = solution.repeatedNTimes(A);

        System.out.println(stdout);
    }
}
