package com.achais.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1399 {
    public int countLargestGroup(int n) {
        int ans = 0, max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int num = calNumber(i);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > max) {
                ans = 1;
                max = map.get(key);
            } else if (map.get(key) == max) {
                ans++;
            }
        }

        return ans;
    }

    public int calNumber(int n) {
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 24;

        Solution1399 solution = new Solution1399();
        Integer stdout = solution.countLargestGroup(n);

        System.out.println(stdout);
    }
}
